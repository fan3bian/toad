package io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import org.junit.Test;

public class TestNIO {
	@Test
	public void client() throws IOException{
		SocketChannel sChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 8181));
		//切换非阻塞模式
		sChannel.configureBlocking(false);
		ByteBuffer buf = ByteBuffer.allocate(1024);
//		Scanner sc = new Scanner(System.in);
//		while(sc.hasNext()){
//			String str =sc.nextLine();
//			buf.put((new Date().toString()+"\n"+str).getBytes());
			buf.put(new Date().toString().getBytes());
			buf.flip();
			sChannel.write(buf);
			buf.clear();
//		}
//		sc.close();
		sChannel.close();
	}
	@Test
	public void server() throws IOException{
		ServerSocketChannel ssChannel =ServerSocketChannel.open();  
		ssChannel.configureBlocking(false);
		ssChannel.bind(new InetSocketAddress(8181));
		
		Selector selector = Selector.open();
		//通道注册选择器，并指定监听接收事件。
		ssChannel.register(selector, SelectionKey.OP_ACCEPT);
		//轮询获取选择器上已经"准备就绪"的事件
		while(selector.select()>0){
			Iterator<SelectionKey> it = selector.selectedKeys().iterator();
			while(it.hasNext()){
				SelectionKey sk = it.next();
				if(sk.isAcceptable()){//接收就绪
					SocketChannel sChannel = ssChannel.accept();
					sChannel.configureBlocking(false);
					//将通道注册到选择器上
					sChannel.register(selector,SelectionKey.OP_READ);
				}else if(sk.isReadable()){
					//获取当前选择器上读就绪状态通道
					SocketChannel sChannel=(SocketChannel) sk.channel();
					sChannel.configureBlocking(false);
					ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
					int len = 0;
					while((len = sChannel.read(byteBuffer))>0){
						byteBuffer.flip();
						System.out.println(new String(byteBuffer.array(),0,len));
						byteBuffer.clear();
					}
				}
				it.remove();//取消selectionkey
			}
		}
		
		
	}
}

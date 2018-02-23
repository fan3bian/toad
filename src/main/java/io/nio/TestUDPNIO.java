package io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import org.junit.Test;

public class TestUDPNIO {
	@Test
	public void client() throws IOException{
		DatagramChannel dChannel = DatagramChannel.open();
		//切换非阻塞模式
		dChannel.configureBlocking(false);
		ByteBuffer buf = ByteBuffer.allocate(1024);
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str =sc.next();
			buf.put((new Date().toString()+"\n"+str).getBytes());
//			buf.put(new Date().toString().getBytes());
			buf.flip();
			dChannel.send(buf, new InetSocketAddress("127.0.0.1", 8181));
			buf.clear();
		}
//		sc.close();
		dChannel.close();
	}
	@Test
	public void receive() throws IOException{
		DatagramChannel dChannel = DatagramChannel.open();
		//切换非阻塞模式
		dChannel.configureBlocking(false);
		dChannel.bind(new InetSocketAddress(8181));
		
		Selector selector = Selector.open();
		//通道注册选择器，并指定监听接收事件。
		dChannel.register(selector, SelectionKey.OP_READ);
		//轮询获取选择器上已经"准备就绪"的事件
		while(selector.select()>0){
			Iterator<SelectionKey> it = selector.selectedKeys().iterator();
			while(it.hasNext()){
				SelectionKey sk = it.next();
				if(sk.isAcceptable()){//接收就绪
					
				}else if(sk.isReadable()){
					//获取当前选择器上读就绪状态通道
					ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
					dChannel.receive(byteBuffer);
					byteBuffer.flip();
					System.out.println(new String(byteBuffer.array(),0,byteBuffer.limit()));
				}
				it.remove();//取消selectionkey
			}
		}
		
	}
}

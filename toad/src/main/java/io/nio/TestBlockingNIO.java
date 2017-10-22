package io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.xml.ws.handler.MessageContext.Scope;

import org.junit.Test;

/**
 * 使用NIO完成网络通信的三个核心： 1.Channel(通道负责连接) java.nio.channels.Channel接口
 * |--SelectableChannel |--SocketChannel |--ServerSocketChannel
 * |--DatagramChannel
 * 
 * |--Pipe.SinkChannel |--Pipe.SourceChannel 2.缓冲区(Buffer):负责数据的存取
 * 3.选择器(Selector):是SelectableChannel多路复用器。用于监控Select
 */
public class TestBlockingNIO {
	@Test
	public void client() throws IOException {
		SocketAddress remote = new InetSocketAddress("127.0.0.1", 8080);
		SocketChannel socketChannel = SocketChannel.open(remote);
		FileChannel finChannel = FileChannel.open(Paths.get("1.jpg"),StandardOpenOption.READ);
		
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		
		while(finChannel.read(buffer)!=-1){
			buffer.flip();
			socketChannel.write(buffer);
			buffer.clear();
		}
		//接收服务端返回
//		socketChannel.shutdownOutput();
//		int len = 0;
//		while((len = socketChannel.read(buffer))!=-1){
//			buffer.flip();
//			System.out.println(new String(buffer.array(),0,len));
//			buffer.clear();
//		}
		finChannel.close();
		socketChannel.close();
	}
	@Test
	public void server() throws IOException{
		ServerSocketChannel ssChannel = ServerSocketChannel.open();
		//绑定连接
		ssChannel.bind(new InetSocketAddress(8080));
		//获取socketChannel
		SocketChannel socketChannel = ssChannel.accept();
		//接受客户端数据，并保存到本地
		FileChannel fileChannel = FileChannel.open(Paths.get("3.jpg"), StandardOpenOption.CREATE,StandardOpenOption.WRITE);
		
		ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
		while(socketChannel.read(byteBuffer)!=-1){
			byteBuffer.flip();
			fileChannel.write(byteBuffer);
			byteBuffer.clear();
		}
		//返回给客户端
//		byteBuffer.put("服务端接收成功".getBytes());
//		byteBuffer.flip();
//		socketChannel.write(byteBuffer);
		
		fileChannel.close();
		socketChannel.close();
		ssChannel.close();
	}
}

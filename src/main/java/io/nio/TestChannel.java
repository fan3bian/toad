package io.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.junit.Test;

public class TestChannel {
	/**
	 * 通过FileStream fis.getChannel()
	 * 
	 * @throws IOException
	 */
	@Test
	public void test() throws IOException {
		FileInputStream fis = new FileInputStream("1.jpg");
		FileOutputStream fos = new FileOutputStream("2.jpg");
		// getChannel()
		FileChannel inChannel = fis.getChannel();// 1.jpg文件与java应用的通道，读通道
		FileChannel outChannel = fos.getChannel();// 2.jpg文件与java应用的通道，写通道
		// Bytebuffer.allcate()分配固定大小缓存
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		// 将inChannel通道中的数据存入缓冲区中
		while (inChannel.read(buffer) != -1) {
			// 将缓冲区中数据写入outChannel
			buffer.flip();// 切换成读取数据模式
			outChannel.write(buffer);
			buffer.clear();
		}
		outChannel.close();
		inChannel.close();
		fos.close();
		fis.close();
	}

	/**
	 * 使用直接缓存区对文件进行映射 内存映射文件
	 * 速度快，但是占用操作系统内存
	 * @throws IOException
	 */
	@Test
	public void test2() throws IOException {
		Path path1 = Paths.get("1.jpg");
		Path path2 = Paths.get("2.jpg");
		OpenOption readOption = StandardOpenOption.READ;
		FileChannel finChannel = FileChannel.open(path1, readOption);
		FileChannel foutChannel = FileChannel.open(path2, readOption, StandardOpenOption.WRITE,StandardOpenOption.CREATE);
		
		// StandardOpenOption.CREATE:如果文件存在，则覆盖
		// StandardOpenOption.CREATE_NEW:如果文件存在，就报错

		MappedByteBuffer inBuffer = finChannel.map(MapMode.READ_ONLY, 0, finChannel.size());
		MappedByteBuffer outBuffer = foutChannel.map(MapMode.READ_WRITE, 0, finChannel.size());
		//不同于使用非直接缓冲区是两个通道通过一个共享的buffer来交换数据
		//直内存映射文件采用复制缓冲区的方式，将一个缓冲区的数据倾倒入另一个缓冲区
		//缓冲区与通道绑定，通道与文件关联，最终导致文件直接映射到缓冲区
		byte[] dst = new byte[inBuffer.limit()];//不可以是Byte
		inBuffer.get(dst);
		outBuffer.put(dst);
		
		finChannel.close();
		foutChannel.close();
	}
	@Test
	public void testTransfer() throws IOException{
		Path path1 = Paths.get("1.jpg");
		Path path2 = Paths.get("2.jpg");
		OpenOption readOption = StandardOpenOption.READ;
		FileChannel finChannel = FileChannel.open(path1, readOption);
		FileChannel foutChannel = FileChannel.open(path2, readOption, StandardOpenOption.WRITE,StandardOpenOption.CREATE);
		
		finChannel.transferTo(0, finChannel.size(), foutChannel);
		//foutChannel.transferFrom(finChannel, 0,finChannel.size());
		
		finChannel.close();
		foutChannel.close();
	}
	@Test
	public void testScaterAndGatter() throws IOException{
		RandomAccessFile infile = new RandomAccessFile("log.txt", "rw");
		RandomAccessFile outfile = new RandomAccessFile("log.copy", "rw");
		FileChannel finChannel = infile.getChannel();
		FileChannel foutChannel = outfile.getChannel();
		//多缓冲区
		ByteBuffer[] dst ={ByteBuffer.allocate(512),ByteBuffer.allocate(1024)}; 
		
		finChannel.read(dst);//将数据有序的放入多个缓冲区，对channel来说是read，对buffer来说是write
		for(ByteBuffer bb :dst) {
			bb.flip();//切换到buffer的读取模式
//			System.out.println("---------------");
//			System.out.println(new String(bb.array(),0,bb.limit()));
		}
		foutChannel.write(dst);
		finChannel.close();
		foutChannel.close();
		infile.close();
		outfile.close();
	}

}

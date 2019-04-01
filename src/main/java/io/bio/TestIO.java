package io.bio;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Enumeration;

import interfaces.S;
import org.junit.Test;

import javax.annotation.Resource;

public class TestIO {
	@Test
	public void test1(){
		//a particular file or a directory
		String dirPath = "E:\\github\\go";
		File directory = new File(dirPath);
		String[] list = directory.list();//if a dir, return arr of files

		//read files
		String filePath = "E:\\github\\go\\cal.go";
		File file = new File(filePath);
		String[] list1 = file.list();//if a file ,return null
		try {
			InputStream inputStream = new FileInputStream(file);
			FileReader fileReader = new FileReader(file);
			int read = inputStream.read();
			System.out.println(read);
			char a =(char) read;
			System.out.println(a);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//writefiles
	}
	@Test
	public void testWriteFile() throws IOException{
		String path = getClass().getClassLoader().getResource("log4j2.xml").getPath();//  /F:/fan3bian/toad/target/classes/log4j2.xml
		String folderPath = getClass().getClassLoader().getResource("").getPath();// /F:/fan3bian/toad/target/classes/
		String protocal = getClass().getClassLoader().getResource("log4j2.xml").getProtocol();// file
		Enumeration<URL> resources = getClass().getClassLoader().getResources("");
		while (resources.hasMoreElements()){
			System.out.println(resources.nextElement());
		}
		System.out.println(path);
		System.out.println(folderPath);
		System.out.println(protocal);
	}
	// byte based streams 字节流
	@Test
	public void testInputStream(){
		try {
			InputStream is = new FileInputStream(new File("E:\\github\\go\\cal.go"));
			InputStream inputStream = new FileInputStream("E:\\github\\go\\cal.go");
			int headByte = is.read();
			System.out.println((char) headByte);
			while ((headByte=inputStream.read())!=-1){
				System.out.print((char) headByte);
			}
			inputStream.close();
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testOutptStream(){
		try {
			OutputStream outputStream = new FileOutputStream("E:\\github\\go\\cal.bak");
			byte[] bytes = "hello world,张矮胖".getBytes();
			for (byte aByte : bytes) {
				outputStream.write(aByte);
			}
			outputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//buffered is used to faster input and output
	@Test
	public void testBufferedInputStream(){
		try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("E:\\github\\go\\cal.bak"))) {

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

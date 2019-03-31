package io.bio;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Enumeration;

import interfaces.S;
import org.junit.Test;

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
		} catch (FileNotFoundException e) {
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
}

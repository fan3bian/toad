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
		InputStream is;
		OutputStream outputStream;
		Writer writer;
		Reader reader;
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

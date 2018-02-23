package io.bio;

import java.io.*;

import interfaces.S;
import org.junit.Test;

public class TestIO {
	//非常奇怪的事情，close方法一共执行了5次
	@Test
	public void testStream(){
//		String filePath = "hello.txt";
		String filePath = "d:"+File.separator+"student.sql";
		System.out.println(filePath);
		try(InputStream is =new FileInputStream(new File(filePath));
			OutputStream os = new FileOutputStream(new File("d:\\student.sqll"))){
			byte[] b = new byte[1024];
			int len ;
			while ((len=is.read(b))!=-1){
//				System.out.println(new String(b,0,len));
				os.write(b,0,len);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	@Test
	public void testFile(){
		File file =new File("");
		String separator = File.separator;
		System.out.println(separator);

	}
}

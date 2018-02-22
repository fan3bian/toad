package io.bio;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Test;

public class TestIO {
	@Test
	public void testStream() {
		InputStream inStream = null;
		OutputStream outputStream = null;
	}
	@Test
	public void testFile(){
		File file =new File("");
		String separator = File.separator;
		System.out.println(separator);
	}
}

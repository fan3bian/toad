package io.nio;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class TestCharset {
	@Test
	public void test(){
		Map<String, Charset> map = Charset.availableCharsets();
		for(Entry<String, Charset> entry :map.entrySet()){
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
	}
	@Test
	public void testEncoder() throws CharacterCodingException{
		Charset gbk =Charset.forName("gbk");
		CharsetEncoder ce = gbk.newEncoder();//编码器
		CharsetDecoder cd = gbk.newDecoder();//解码器
		//解码：将字节转化成字符
		CharBuffer charBuffer = CharBuffer.allocate(1024);
		charBuffer.put("莫向外求！");
		charBuffer.flip();
		//编码：将字符转化成字节
		ByteBuffer byteBuffer = ce.encode(charBuffer);
		for(int i = 0; i<byteBuffer.limit();i++){
			System.out.println(byteBuffer.get());
		}
		byteBuffer.flip();
		CharBuffer cbr = cd.decode(byteBuffer);
		System.out.println(cbr.toString());
		byteBuffer.flip();
		Charset utf8 = Charset.forName("UTF-8");
		CharBuffer utf8cbr = utf8.decode(byteBuffer);//使用charset.decode()
		System.out.println(utf8cbr.toString());
	}
}

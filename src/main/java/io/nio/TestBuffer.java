package io.nio;

import java.nio.ByteBuffer;
import java.util.Arrays;

//import org.apache.log4j.Logger;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TestBuffer {
//	org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(getClass());
	Logger logger = LoggerFactory.getLogger(getClass());
	@Test
	public void test(){
		ByteBuffer buffer =  ByteBuffer.allocate(1024);
//		logger.debug("{}",buffer.getClass());//占位符
//		logger.debug(buffer.toString());
		buffer.put("abc".getBytes());
//		logger.debug(buffer.toString());
		buffer.flip();//切换到读取模式 pos=0 limit=pre-pos
//		logger.debug(buffer.toString());
		byte[] dst = new byte[buffer.limit()];
		buffer.get(dst);
//		logger.debug(new String(dst,0,dst.length));
		logger.debug(Arrays.toString(dst));//97(a) 98 99
//		logger.debug(buffer.toString());
		buffer.rewind();//可重复读数据
//		logger.debug(buffer.toString());
		buffer.clear();//清空缓冲区
//		logger.debug(buffer.toString());//数据仍存在，数据处于"被遗忘"状态
//		logger.debug((char)buffer.get()+"");
		/**
		 * pos
		 * mark:mark记录了pos的位置，可以通过reset()恢复到pos的位置
		 * flip():将缓冲区切换读取状态
		 */
	}
	@Test
	public void testMark(){
		ByteBuffer buffer =  ByteBuffer.allocate(1024);
		buffer.put("abc".getBytes());
		buffer.flip();
		byte[] dst = new byte[buffer.limit()];
		buffer.get(dst,0,1);
		logger.debug(buffer.toString());
		
		buffer.mark();
		
		buffer.get(dst,1,2);
		logger.debug(buffer.toString());
		
		buffer.reset();//
		/**
		 * reset()使pos=mark
		 */
		logger.debug(buffer.toString());
		if(buffer.hasRemaining()){//pos<limit?
			logger.debug(""+buffer.remaining());
		}
	}
	@Test
	public void testAllocateDirect(){
		ByteBuffer buffer =  ByteBuffer.allocateDirect(1024);
		logger.debug(buffer.isDirect()+"");
	}
}

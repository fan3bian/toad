package base;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import domain.Item;
import util.DateUtil;
import util.JsonUtil;

public class TestDate {
	@Test
	public void test1() throws IOException{
		String dateStr = DateUtil.getSystem_Date();
		Date date = DateUtil.parseDate(dateStr,DateUtil.DATETIME_FORMAT);
		System.out.println(dateStr);
		System.out.println(date.toGMTString());
		System.out.println(date.toLocaleString());
		//Date date =JsonUtil.fromJson(dateStr, Date.class);
//		System.out.println(date.toString());
		
	}
	@Test
	public void test2() throws IOException{
		Item item = new Item();
//		Date date = new Date();
//		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		item.setDate(new Date());
		System.out.println(JsonUtil.toJson(item));
		String str = "{\"date\":\"2018-04-17 14:02:18\"}";
		Item it = JsonUtil.fromJson(str, Item.class);
		System.out.println(it.getDate().toString());
	}
}

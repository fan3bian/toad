package enumration;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import util.JsonUtil;

public class TestEnum {
	public static void main(String[] args) {
		Student student =new Student();
		List<String> list1 =Arrays.asList("1","2","3");
		student.setList(list1);
		List<String> temList = list1;
		for(String str :temList){
			System.out.println(temList.size());
		}
		

		String targets =",,,,";
		String[] arr = targets.split(",");
		System.out.println(arr[1]);
		System.out.println(arr.length);
		System.out.println(GoodsStatusEnum.enumMap);
		System.out.println(GoodsStatusEnum.enumMap.containsKey((byte)1));
	}
	@Test
	public void test(){
		Set<Long> skuIdSet = new HashSet<Long>();
		skuIdSet.add(761680L);
		skuIdSet.add(100012L);
		skuIdSet.add(313382L);
		System.out.println(JsonUtil.toJson(skuIdSet));
		Set<ProductBaseFieldEnum> baseFieldSet = new HashSet<ProductBaseFieldEnum>();
        baseFieldSet.add(ProductBaseFieldEnum.CATEGORY);
        
        System.out.println(JsonUtil.toJson(baseFieldSet));
	}
}
		
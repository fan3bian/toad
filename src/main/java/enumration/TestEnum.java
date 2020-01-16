package enumration;

import java.lang.reflect.Field;
import java.util.*;

import domain.SSendpay;
import domain.WbMarkUtil;
import org.apache.commons.lang.StringUtils;
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
	@Test
	public void test2() throws Exception {
        WbMarkUtil sendpay = new WbMarkUtil();
        SSendpay ssendpay = new SSendpay();
        Map<Integer, String> blankFiledMap = new HashMap<Integer, String>();
        Map<Integer, Integer> blankIndexMap = new HashMap<Integer, Integer>();
//		WbMarkEnum[] values = WbMarkEnum.values();
        for (WbMarkEnum obj : WbMarkEnum.values()) {
            System.out.println(obj.getFieldName());
            if (StringUtils.isBlank(obj.getFieldName()) && obj.getKey() == '0') {
                blankIndexMap.put(obj.getIndex(), obj.getIndex());
                continue;
            }
            blankFiledMap.put(obj.getIndex(), obj.getFieldName());
            Field field = ssendpay.getClass().getDeclaredField(obj.getFieldName());
            field.setAccessible(true);
            field.set(ssendpay, sendpay.byteAt(obj.getIndex()));
        }
    }
    @Test
    public void test3() throws Exception{
        RtwSourceEnum[] values = RtwSourceEnum.values();
        for (RtwSourceEnum value : values) {
            System.out.println(value.getParamName());
            System.out.println(value.getParamNameDes());
        }
    }
}
		
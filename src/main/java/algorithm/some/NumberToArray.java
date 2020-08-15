package algorithm.some;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberToArray {
    /**
     * 非负数a,转换成数组
     *
     * @param a
     * @return 返回值是list的原因是无法确定返回值是数量
     */
    public static List<Integer> numberToArray(int a) {
        List<Integer> list = new ArrayList<>();
        while (a > 0) {
            int i = a % 10;//放入列表中的是余数
            list.add(i);//每次除等10
            a /= 10;
        }
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(numberToArray(1324567));
    }
}

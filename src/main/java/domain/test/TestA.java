package domain.test;

import domain.Order;
import org.apache.commons.lang3.StringUtils;
import util.JsonUtil;
import util.ValidatorUtil2;

import java.util.Collections;

public class TestA {

    public static void main(String[] args) {
        Order order = new Order();
        order.setOrderNo("blank 211");
        order.setSubOrder(false);
        order.setCod(false);
        order.setBizNo("blank 211");
        order.setItemList(Collections.emptyList());


        ValidatorUtil2.Result validate = ValidatorUtil2.validate(order);
        System.out.println(JsonUtil.toJson(validate));
    }
}

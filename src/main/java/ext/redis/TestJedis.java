package ext.redis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TestJedis {
    @Test
    public void test(){
        BigDecimal a = new BigDecimal("2342.234234");
         a= a.setScale(4, RoundingMode.HALF_UP);
        System.out.println(a);
//        Jedis jedis =new Jedis("some-redis-master.clpsbase.svc.cluster.local",7000);
//        jedis.equals("a");
//        String a = jedis.get("a");
//        System.out.println(a);

    }
}

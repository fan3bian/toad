package ext.redis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class TestJedis {
    @Test
    public void test(){
        Jedis jedis =new Jedis("47.105.38.61",6379);
        jedis.equals("a");
        String a = jedis.get("a");
        System.out.println(a);

    }
}

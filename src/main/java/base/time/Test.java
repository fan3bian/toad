package base.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.TimeZone;

public class Test {

    public static void main(String[] args) {
        Instant inst1 = Instant.now();
        System.out.println("Inst1 : " + inst1);
        Instant inst2 = inst1.plus(Duration.ofSeconds(10));
        System.out.println("Inst2 : " + inst2);

        System.out.println("Difference in milliseconds : " + Duration.between(inst1, inst2).toMillis());

        System.out.println("Difference in seconds : " + Duration.between(inst1, inst2).getSeconds());
        System.out.println("Difference in seconds : " + Duration.between(inst2, inst1).getSeconds());

    }
    @org.junit.Test
    public void testTimeZone() throws ParseException {
        SimpleDateFormat f1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        f1.setTimeZone(TimeZone.getTimeZone("CST"));
        System.out.println(f1.parse("2015-09-01 00:00:00"));
    }
}

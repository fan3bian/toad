import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ToadApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
    }

    @Test
    public void Stock() {
        Double waveLow = 8.60;
        Double waveHigh = 12.22;
        Double waveReturn = new Double(1);
        Double target1 = new Double(1);
        Double target2 = new Double(1);
        Double target3 = new Double(1);
        double predictWareReturnHigh = Math.pow(waveLow, 0.382) * Math.pow(waveHigh, 0.618);
        double predictWareReturnMid = Math.pow(waveLow * waveHigh, 0.5);
        double predictWareReturnLow = Math.pow(waveLow, 0.618) * Math.pow(waveHigh, 0.382);

        System.out.println(predictWareReturnHigh);
        System.out.println(predictWareReturnMid);
        System.out.println(predictWareReturnLow);


    }
}

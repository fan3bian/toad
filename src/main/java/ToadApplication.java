import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ToadApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
    }
}

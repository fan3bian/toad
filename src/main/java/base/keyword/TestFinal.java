package base.keyword;

import domain.Student;
import org.junit.Test;

public class TestFinal {

    @Test
    public void test1(){
        Student student = new Student();
        System.out.println(student);
        changeStudent(student);
        System.out.println(student);//no change
    }

    private void changeStudent(Student student){
        System.out.println(student);
        student =new Student();
        System.out.println(student);
    }
}

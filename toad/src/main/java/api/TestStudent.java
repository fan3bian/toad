package api;

import api.impl.StudentServiceImpl;
import domain.Student;

/**
 * Created by zhangshuyi1 on 2018/2/15.
 */
public class TestStudent {
    public static void main(String[] args) {
        StudentService studentService =new StudentServiceImpl();
        Student student = studentService.getStudent(null);
        student.getAge();
    }
}

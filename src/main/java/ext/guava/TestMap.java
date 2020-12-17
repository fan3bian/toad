package ext.guava;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.Multimaps;
import domain.Student;

import java.util.ArrayList;
import java.util.List;

public class TestMap {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student student = new Student();
        student.setAge(12);
        student.setId(12L);
        studentList.add(student);
        System.out.println(student);
        ImmutableListMultimap<Long, Student> studentListMap = Multimaps.index(studentList, new Function<Student, Long>(){
            @Override
            public Long apply(Student orderItem){
                return orderItem.getId();
            }
        });
        for (Student stu : studentList) {
            stu.setAge(26);
            ImmutableList<Student> students = studentListMap.get(stu.getId());
            for (Student student1 : students) {
                System.out.println(student1);
                System.out.println(student1.getAge());
            }
        }

    }
    public void test1(){
        List<Student> studentList = null;
        ImmutableListMultimap<Long, Student> soPackItemMap = Multimaps.index(studentList, new Function<Student, Long>(){
            @Override
            public Long apply(Student orderItem){
                return orderItem.getId();
            }
        });//NullPointerException
    }
}

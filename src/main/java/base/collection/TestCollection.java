package base.collection;

import domain.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollection {
    private static final Object[] EMPTY_ELEMENTDATA = {1};

    public static void main(String[] args) {
        List list =new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(0,0);
        list.remove(1);
        System.out.println(list);
        Student s = new Student();
        List<Student> lists =new ArrayList<>();
        lists.add(s);
//        Collections.sort(lists);
    }


}

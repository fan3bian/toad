package trdLib.guava;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.Multimaps;
import domain.Student;

import java.util.List;

public class TestMap {
    public static void main(String[] args) {
        List<Student> studentList = null;
        ImmutableListMultimap<Long, Student> soPackItemMap = Multimaps.index(studentList, new Function<Student, Long>(){
            public Long apply(Student orderItem){
                return orderItem.getId();
            }
        });
    }
}

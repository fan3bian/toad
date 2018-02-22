package api.impl;

import api.StudentService;
import domain.Student;

import java.util.Objects;

/**
 * Created by zhangshuyi1 on 2018/2/15.
 */
public class StudentServiceImpl implements StudentService {
    @Override
    public Student getStudent(Long id) {
        Objects.requireNonNull(id,"The id is null");
        return new Student();
    }
}

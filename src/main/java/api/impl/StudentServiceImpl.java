package api.impl;

import api.StudentService;

import java.util.Objects;


/**
 * Created by zhangshuyi1 on 2018/2/15.
 */
public class StudentServiceImpl implements StudentService {
    @Override
    public void getStudent(Long id) {
        Objects.requireNonNull(id);
    }
}

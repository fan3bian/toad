package api;

import domain.Student;

/**
 * Created by zhangshuyi1 on 2018/2/15.
 */
public interface StudentService {
    /**
     * @throws NullPointerException
     * @param id
     * @return Student
     */
    public Student getStudent(Long id);
}

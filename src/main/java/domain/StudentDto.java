package domain;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class StudentDto {
    private long id;
    private String name;
    private int age;
    private Date date;
    private List<String> boxList;
}

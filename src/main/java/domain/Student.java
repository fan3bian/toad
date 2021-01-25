package domain;

import ext.xml.XmlUtil;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by zhangshuyi1 on 2018/2/15.
 */
@Data
public class Student {
    @Min(0)
    @Max(1)
    private Long id;
    private String name;
    private Integer age;
    private Date date;
    private Double weight;
    @Positive
    private BigDecimal volume;
    private List<String> boxList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<String> getBoxList() {
        return boxList;
    }

    public void setBoxList(List<String> boxList) {
        this.boxList = boxList;
    }

    public static void main(String[] args) {



        Student student = new Student();
        student.setAge(18);
        student.setId(1L);
        student.setName("zhangshuyi");
        student.setDate(new Date());
        List<String> list = Arrays.asList("001", "002");
        student.setBoxList(list);
        System.out.println(XmlUtil.generateXmlTaskContent(student));

        String s = "<id>1231</id><name>1231</name><age>1231</age><date>1231</date>";
        Student s2 = (Student) XmlUtil.fromXml(s, Student.class);
    }

}

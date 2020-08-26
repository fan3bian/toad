package trdLib.mapper;

import com.google.common.collect.Lists;
import domain.Order;
import domain.Student;
import domain.StudentDto;
import org.apache.commons.lang3.StringUtils;
import org.apache.lucene.util.RamUsageEstimator;
import org.junit.Test;
import org.modelmapper.ModelMapper;
import util.JsonUtil;

public class TestMapper {

    @Test
    public void testModelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        Student student = new Student();
        student.setId(-1L);
        student.setName(StringUtils.EMPTY);
        student.setAge(-1);
        student.setDate(null);
        student.setBoxList(Lists.<String>newArrayList());
        student.setWeight(-1d);

        System.out.println(RamUsageEstimator.sizeOf(modelMapper));
        StudentDto studentDTO = modelMapper.map(student, StudentDto.class);
        System.out.println(RamUsageEstimator.sizeOf(modelMapper));
        Student student2 = modelMapper.map(studentDTO, Student.class);
        System.out.println(RamUsageEstimator.sizeOf(modelMapper));
        Order map = modelMapper.map(studentDTO, Order.class);
        System.out.println(RamUsageEstimator.sizeOf(modelMapper));
        Order map2 = modelMapper.map(studentDTO, Order.class);
        System.out.println(RamUsageEstimator.sizeOf(modelMapper));

        System.out.println(JsonUtil.toJson(studentDTO));
        System.out.println(JsonUtil.toJson(student2));


    }
}

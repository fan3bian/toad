package util;

import com.google.common.collect.Lists;
import domain.Student;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.lucene.util.RamUsageEstimator;
import org.hibernate.validator.HibernateValidator;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.math.BigDecimal;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Slf4j
public class ValidationUtils {
    private static Validator validator = Validation
            .byProvider(HibernateValidator.class)
            .configure()
            .failFast(true)
            .buildValidatorFactory()
            .getValidator();

    public static <T> void validate(T obj) {
        Set<ConstraintViolation<T>> validate = validator.validate(obj);
        for (ConstraintViolation<T> violation : validate) {
            // TODO 注意:这里需根据实际业务进行自定义异常的抛出或做响应的操作
            log.info("错误信息=[{}{}]", violation.getPropertyPath().toString(), violation.getMessage());
        }
    }

    private static ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();

    public static void validate2(Object object, Class<?>... groups) {

        Instant now = Instant.now();
        Validator validator = validatorFactory.getValidator();
        Instant.now();
        System.out.println(RamUsageEstimator.sizeOf(validator));
        //validator

//        Validator validator2 = validatorFactory.getValidator();
//        System.out.println(validator == validator2);
        Set<ConstraintViolation<Object>> validateResult = validator.validate(object, groups);
        if (!validateResult.isEmpty()) {   //如果校验有值
            List<String> errMsgList = new ArrayList<String>();
            Iterator iterator = validateResult.iterator();
            while (iterator.hasNext()) {
                ConstraintViolation violation = (ConstraintViolation) iterator.next();
                errMsgList.add(violation.getMessage());
            }
            System.out.println(false);
        } else {
            System.out.println(false);
        }
        System.out.println(RamUsageEstimator.sizeOf(validator));

    }

    public static void main(String[] args) {

        Student student = new Student();
        student.setId(-1L);
        student.setName(StringUtils.EMPTY);
        student.setAge(-1);
        student.setDate(null);
        student.setBoxList(Lists.<String>newArrayList());

        validate2(student);

    }

    @Test
    public void test1() {
        Instant now = Instant.now();
//        for (int i = 0; i < 10000; i++) {
//            Validator validator = Validation
//                    .byProvider(HibernateValidator.class)
//                    .configure()
//                    .failFast(true)
//                    .buildValidatorFactory()
//                    .getValidator();
//        }
//        Instant end = Instant.now();
//
//        long seconds = Duration.between(now, end).getSeconds();
//        System.out.println(seconds);
        Instant now2 = Instant.now();

        for (int i = 0; i < 10000; i++) {
            Validator validator = validatorFactory.getValidator();
        }
        Instant end2 = Instant.now();
        long seconds2 = Duration.between(now2, end2).getSeconds();
        System.out.println(seconds2);

    }

    @Test
    public void test2() {
        Student student = new Student();
        student.setId(0L);
        student.setName(StringUtils.EMPTY);
        student.setAge(-1);
        student.setDate(null);
        student.setBoxList(Lists.<String>newArrayList());
        student.setWeight(-1d);
        student.setVolume(new BigDecimal(9));
        Set<ConstraintViolation<Student>> validate = validator.validate(student);
    }

    @Test
    public void test3() {
        boolean numeric = StringUtils.isNumeric("");
        System.out.println(numeric);
        BigDecimal bigDecimal = new BigDecimal("");
        System.out.println(bigDecimal);
    }
}

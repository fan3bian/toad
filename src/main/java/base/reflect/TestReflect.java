package base.reflect;

import domain.Student;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.util.stream.Stream;

public class TestReflect {
    public static void main(String[] args) throws IntrospectionException {
        BeanInfo beanInfo = Introspector.getBeanInfo(Student.class);
        Stream.of(beanInfo.getPropertyDescriptors()).forEach(propertyDescriptor -> {
            System.out.println(propertyDescriptor);
            Class<?> propertyType = propertyDescriptor.getPropertyType();
            String name = propertyDescriptor.getName();
            if ("age".equals(name)) {
//                propertyDescriptor.setPropertyEditorClass();
            }
        });
    }
}
 
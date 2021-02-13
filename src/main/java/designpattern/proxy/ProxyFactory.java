package designpattern.proxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

import java.lang.reflect.Proxy;

public class ProxyFactory {

    public static Object getJDKProxy(Object o) {
        Class<?> aClass = o.getClass();
        return Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), (proxy, method, args) -> {
            System.out.println("before jdk proxy invoking");
            Object invoke = method.invoke(o, args);
            System.out.println("after jdk proxy invoking");
            return invoke;
        });
        /**
         * JDK动态代理依靠Proxy和InvocationHandler实现。
         * InvocationHandler里定义了invoke方法，表示为方法调用的抽象。
         * Proxy.newProxyInstance通过目标类的类加载器、目标类的接口数组、和自定义的InvocationHandler对象，
         * 以反射的方式去创建一个代理对象($Proxy0)，对代理对象方法的调用，转换为对其成员变量h的invoke方法代用，
         * 进而以反射的形式去调用目标方法，完成代理。
         */
    }

    public static Object getCglibProxy(Object obj) {
        return Enhancer.create(obj.getClass(), (MethodInterceptor) (o, method, objects, methodProxy) -> {
            System.out.println("before cglib proxy invoking");
            Object invoke = method.invoke(obj, objects);
            System.out.println("after cglib proxy invoking");
            return invoke;
        });
    }
    /**
     * cglib动态代理通过继承目标类实现增强
     */
}

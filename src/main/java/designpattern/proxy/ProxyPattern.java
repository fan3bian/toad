package designpattern.proxy;

/**
 * 静态代理
 */
public class ProxyPattern {


    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Subject proxy = new SubjectProxy(subject);
        proxy.request();
    }

}

interface Subject {
    void request();
}

class ConcreteSubject implements Subject {
    @Override
    public void request() {
        System.out.println("ConcreteSubject request");
    }
}

class SubjectProxy implements Subject {

    Subject subject;

    public SubjectProxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        System.out.println("before invoking concrete method");
        subject.request();
        System.out.println("after invoking concrete method");
    }
}
/*
代理模式：创建一个代理类，代理类和具体类实现了同一个接口。代理对象持有具体对象的引用，客户端通过访问代理对象达到访问具体对象的目的。

用途：
1. 懒加载。目标对象需要复杂繁琐的实例化步骤，代理对象持有目标的引用。
2. RPC，远程对象一般仅持有对接对象，需要依靠动态代理来来实例化


When we want a simplified version of a complex or heavy object.
When the original object is present in different address space, and we want to represent it locally
When we want to add a layer of security to the original underlying object to provide controlled access based on access rights of the client.

 */
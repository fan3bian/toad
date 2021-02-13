//package designpattern.proxy;
//
//import java.lang.reflect.Method;
//import java.lang.reflect.Proxy;
//import java.lang.reflect.UndeclaredThrowableException;
//
//final class Proxy0 extends Proxy implements Subject {
//    private static Method m1;
//    private static Method m2;
//    private static Method m3;
//    private static Method m0;
//
//    public Proxy0() {
//        super(paramInvocationHandler);
//    }
//
//    static {
//        try {
//            m1 = Class.forName("java.lang.Object").getMethod("equals", new Class[]{Class.forName("java.lang.Object")});
//            m2 = Class.forName("java.lang.Object").getMethod("toString", new Class[0]);
//            m3 = Class.forName("designpattern.Subject").getMethod("request", new Class[0]);
//            m0 = Class.forName("java.lang.Object").getMethod("hashCode", new Class[0]);
//            return;
//        } catch (NoSuchMethodException localNoSuchMethodException) {
//            throw new NoSuchMethodError(localNoSuchMethodException.getMessage());
//        } catch (ClassNotFoundException localClassNotFoundException) {
//            throw new NoClassDefFoundError(localClassNotFoundException.getMessage());
//        }
//    }
//
//    public final boolean equals() {
//        try {
//            return ((Boolean) this.h.invoke(this, m1, new Object[]{paramObject})).booleanValue();
//        } catch (RuntimeException localRuntimeException) {
//            throw localRuntimeException;
//        } catch (Throwable localThrowable) {
//            throw new UndeclaredThrowableException(localThrowable);
//        }
//    }
//
//    public final String toString() {
//        try {
//            return ((String) this.h.invoke(this, m2, null));
//        } catch (RuntimeException localRuntimeException) {
//            throw localRuntimeException;
//        } catch (Throwable localThrowable) {
//            throw new UndeclaredThrowableException(localThrowable);
//        }
//    }
//
//    public final int hashCode() {
//        try {
//            return ((Integer) this.h.invoke(this, m0, null)).intValue();
//        } catch (RuntimeException localRuntimeException) {
//            throw localRuntimeException;
//        } catch (Throwable localThrowable) {
//            throw new UndeclaredThrowableException(localThrowable);
//        }
//    }
//
//    public final void request() {
//        try {
//            this.h.invoke(this, m3, null);
//            return;
//        } catch (RuntimeException localRuntimeException) {
//            throw localRuntimeException;
//        } catch (Throwable localThrowable) {
//            throw new UndeclaredThrowableException(localThrowable);
//        }
//    }
//}
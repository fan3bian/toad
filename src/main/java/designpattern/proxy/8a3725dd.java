//package designpattern.proxy;
//
//public class 8a3725dd extends ConcreteSubject
//        implements Factory
//        {
//private boolean CGLIB$BOUND;
//public static Object CGLIB$FACTORY_DATA;
//private static final ThreadLocal CGLIB$THREAD_CALLBACKS;
//private static final Callback[]CGLIB$STATIC_CALLBACKS;
//private MethodInterceptor CGLIB$CALLBACK_0;
//private static Object CGLIB$CALLBACK_FILTER;
//private static final Method CGLIB$request$0$Method;
//private static final MethodProxy CGLIB$request$0$Proxy;
//private static final Object[]CGLIB$emptyArgs;
//private static final Method CGLIB$equals$1$Method;
//private static final MethodProxy CGLIB$equals$1$Proxy;
//private static final Method CGLIB$toString$2$Method;
//private static final MethodProxy CGLIB$toString$2$Proxy;
//private static final Method CGLIB$hashCode$3$Method;
//private static final MethodProxy CGLIB$hashCode$3$Proxy;
//private static final Method CGLIB$clone$4$Method;
//private static final MethodProxy CGLIB$clone$4$Proxy;
//
//static
//  {
//          CGLIB$STATICHOOK1();
//          }
//
//public final boolean equals()
//        {
//        MethodInterceptor tmp4_1=this.CGLIB$CALLBACK_0;
//        if(tmp4_1==null)
//        {
//        tmp4_1;
//        CGLIB$BIND_CALLBACKS(this);
//        }
//        MethodInterceptor tmp17_14=this.CGLIB$CALLBACK_0;
//        if(tmp17_14==null)
//        break label57;
//        label50:label57:if(tmp17_14.intercept(this,CGLIB$equals$1$Method,new Object[]{paramObject},CGLIB$equals$1$Proxy)!=null)
//        break label50;
//        }
//
//public final String toString()
//        {
//        MethodInterceptor tmp4_1=this.CGLIB$CALLBACK_0;
//        if(tmp4_1==null)
//        {
//        tmp4_1;
//        CGLIB$BIND_CALLBACKS(this);
//        }
//        MethodInterceptor tmp17_14=this.CGLIB$CALLBACK_0;
//        if(tmp17_14!=null)
//        return((String)tmp17_14.intercept(this,CGLIB$toString$2$Method,CGLIB$emptyArgs,CGLIB$toString$2$Proxy));
//        return super.toString();
//        }
//
//public final int hashCode()
//        {
//        MethodInterceptor tmp4_1=this.CGLIB$CALLBACK_0;
//        if(tmp4_1==null)
//        {
//        tmp4_1;
//        CGLIB$BIND_CALLBACKS(this);
//        }
//        MethodInterceptor tmp17_14=this.CGLIB$CALLBACK_0;
//        if(tmp17_14==null)
//        break label52;
//        label45:label52:if(tmp17_14.intercept(this,CGLIB$hashCode$3$Method,CGLIB$emptyArgs,CGLIB$hashCode$3$Proxy)!=null)
//        break label45;
//        }
//
//protected final Object clone()
//        throws CloneNotSupportedException
//        {
//        MethodInterceptor tmp4_1=this.CGLIB$CALLBACK_0;
//        if(tmp4_1==null)
//        {
//        tmp4_1;
//        CGLIB$BIND_CALLBACKS(this);
//        }
//        MethodInterceptor tmp17_14=this.CGLIB$CALLBACK_0;
//        if(tmp17_14!=null)
//        return tmp17_14.intercept(this,CGLIB$clone$4$Method,CGLIB$emptyArgs,CGLIB$clone$4$Proxy);
//        return super.clone();
//        }
//
//public Object newInstance(,Object[]paramArrayOfObject,Callback[]paramArrayOfCallback)
//        {
//        CGLIB$SET_THREAD_CALLBACKS(paramArrayOfCallback);
//        Class[]tmp9_8=paramArrayOfClass;
//        switch(tmp9_8.length)
//        {
//        case 0:
//        tmp9_8;
//        break;
//default:
//        new 8a3725dd();
//        throw new IllegalArgumentException("Constructor not found");
//        }
//        CGLIB$SET_THREAD_CALLBACKS(null);
//        }
//
//public Object newInstance()
//        {
//        CGLIB$SET_THREAD_CALLBACKS(paramArrayOfCallback);
//        CGLIB$SET_THREAD_CALLBACKS(null);
//        return new 8a3725dd();
//        }
//
//public Object newInstance()
//        {
//        CGLIB$SET_THREAD_CALLBACKS(new Callback[]{paramCallback});
//        CGLIB$SET_THREAD_CALLBACKS(null);
//        return new 8a3725dd();
//        }
//
//public final void request()
//        {
//        MethodInterceptor tmp4_1=this.CGLIB$CALLBACK_0;
//        if(tmp4_1==null)
//        {
//        tmp4_1;
//        CGLIB$BIND_CALLBACKS(this);
//        }
//        if(this.CGLIB$CALLBACK_0!=null)
//        return;
//        super.request();
//        }
//
//final String CGLIB$toString$2()
//        {
//        return super.toString();
//        }
//
//final boolean CGLIB$equals$1()
//        {
//        return super.equals(paramObject);
//        }
//
//final int CGLIB$hashCode$3()
//        {
//        return super.hashCode();
//        }
//
//final void CGLIB$request$0()
//        {
//        super.request();
//        }
//
//final Object CGLIB$clone$4()
//        throws CloneNotSupportedException
//        {
//        return super.clone();
//        }
//
//private static final void CGLIB$BIND_CALLBACKS(Object paramObject)
//        {
//        8a3725dd local8a3725dd=(8a3725dd)paramObject;
//        if(local8a3725dd.CGLIB$BOUND)
//        break label52;
//        local8a3725dd.CGLIB$BOUND=true;
//        Object tmp23_20=CGLIB$THREAD_CALLBACKS.get();
//        if(tmp23_20!=null)
//        break label39;
//        tmp23_20;
//        Callback[]tmp31_28=CGLIB$STATIC_CALLBACKS;
//        if(tmp31_28!=null)
//        break label39;
//        tmp31_28;
//        label39:label52:break label52:
//        }
//
//static void CGLIB$STATICHOOK1()
//        {
//        Class localClass2;
//        CGLIB$THREAD_CALLBACKS=new ThreadLocal();
//        CGLIB$emptyArgs=new Object[0];
//        Class localClass1=Class.forName("designpattern.proxy.ConcreteSubject$$EnhancerByCGLIB$$8a3725dd");
//        Method[]tmp50_47=ReflectUtils.findMethods(new String[]{"request","()V"},(localClass2=Class.forName("designpattern.proxy.ConcreteSubject")).getDeclaredMethods());
//        CGLIB$request$0$Method=tmp50_47[0];
//        CGLIB$request$0$Proxy=MethodProxy.create(localClass2,localClass1,"()V","request","CGLIB$request$0");
//        tmp50_47;
//        Method[]tmp131_128=ReflectUtils.findMethods(new String[]{"equals","(Ljava/lang/Object;)Z","toString","()Ljava/lang/String;","hashCode","()I","clone","()Ljava/lang/Object;"},(localClass2=Class.forName("java.lang.Object")).getDeclaredMethods());
//        CGLIB$equals$1$Method=tmp131_128[0];
//        CGLIB$equals$1$Proxy=MethodProxy.create(localClass2,localClass1,"(Ljava/lang/Object;)Z","equals","CGLIB$equals$1");
//        Method[]tmp151_131=tmp131_128;
//        CGLIB$toString$2$Method=tmp151_131[1];
//        CGLIB$toString$2$Proxy=MethodProxy.create(localClass2,localClass1,"()Ljava/lang/String;","toString","CGLIB$toString$2");
//        Method[]tmp171_151=tmp151_131;
//        CGLIB$hashCode$3$Method=tmp171_151[2];
//        CGLIB$hashCode$3$Proxy=MethodProxy.create(localClass2,localClass1,"()I","hashCode","CGLIB$hashCode$3");
//        Method[]tmp191_171=tmp171_151;
//        CGLIB$clone$4$Method=tmp191_171[3];
//        CGLIB$clone$4$Proxy=MethodProxy.create(localClass2,localClass1,"()Ljava/lang/Object;","clone","CGLIB$clone$4");
//        tmp191_171;
//        }
//
//public static MethodProxy CGLIB$findMethodProxy(Signature paramSignature)
//        {
//        String tmp4_1=paramSignature.toString();
//        switch(tmp4_1.hashCode())
//        {
//        case-508378822:
//        if(!(tmp4_1.equals("clone()Ljava/lang/Object;")))
//        break label121;
//        label121:return CGLIB$clone$4$Proxy;
//        case 37055110:
//        case 1826985398:
//        case 1913648695:
//        case 1984935277:
//        }
//        }
//
//public void setCallbacks()
//        {
//        this.CGLIB$CALLBACK_0=((MethodInterceptor)paramArrayOfCallback[0]);
//        }
//
//public void setCallback(,Callback paramCallback)
//        {
//        switch(paramInt)
//        {
//        case 0:
//        this.CGLIB$CALLBACK_0=((MethodInterceptor)paramCallback);
//        }
//        }
//
//public Callback getCallback()
//        {
//        CGLIB$BIND_CALLBACKS(this);
//        switch(paramInt)
//        {
//        case 0:
//        }
//        return null;
//        }
//
//public Callback[]getCallbacks()
//        {
//        CGLIB$BIND_CALLBACKS(this);
//        return{this.CGLIB$CALLBACK_0};
//        }
//
//public static void CGLIB$SET_STATIC_CALLBACKS(Callback[]paramArrayOfCallback)
//        {
//        CGLIB$STATIC_CALLBACKS=paramArrayOfCallback;
//        }
//
//public static void CGLIB$SET_THREAD_CALLBACKS(Callback[]paramArrayOfCallback)
//        {
//        CGLIB$THREAD_CALLBACKS.set(paramArrayOfCallback);
//        }
//        }
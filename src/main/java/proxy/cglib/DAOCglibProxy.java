package proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class DAOCglibProxy implements MethodInterceptor {

    private Object target;

    public Object getInstance(Object target) {
        this.target  = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("---执行方法之前---");
        Object result = methodProxy.invokeSuper(o, args);
        System.out.println("---执行方法之后---");
        return result;
    }
}

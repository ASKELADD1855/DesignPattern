package com.askeladd.structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 17:34
 * @PackageName:com.askeladd.structural.proxy.dynamic
 * @ClassName: MyJdkDynamicProxy
 * @Description: TODO
 * @Version 1.0
 */
public class MyJdkDynamicProxy<T> implements InvocationHandler {
    private T target;

    public MyJdkDynamicProxy(T target){
        this.target = target;
    }

    public static<T>T getProxy(T t){
    /*
    *   1 ClassLoader loader 当前被代理对象的类加载器
    *   2 Class<?>[] interfaces 当前被代理对象所实现的所有接口
    *   3 InvocationHandler h , 当前被代理对象执行目标方法的时候我们使用h可以定义拦截增强方法
    * */

        Object o = Proxy.newProxyInstance(
                t.getClass().getClassLoader(),
                t.getClass().getInterfaces(),   // 必须接口
                new MyJdkDynamicProxy(t)
        );

        return (T)o;
    }

    // 定义目标方法的拦截逻辑: 每个方法都会进来
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 反射执行
        System.out.println("真正执行被代理对象的方法");
        Object invoke = method.invoke(target, args);
        System.out.println("返回值"+invoke);
        return invoke;
    }
}

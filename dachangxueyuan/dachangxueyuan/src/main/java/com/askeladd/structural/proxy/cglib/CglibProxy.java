package com.askeladd.structural.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 18:22
 * @PackageName:com.askeladd.structural.proxy.cglib
 * @ClassName: CglibProxy
 * @Description: TODO
 * @Version 1.0
 */
public class CglibProxy {

    // 为任意对象创建代理
    public static<T> T createProxy(T t){
        // 1 创建一个增强器
        Enhancer enhancer = new Enhancer();
        // 2 设置要增强哪个类的功能。 增强器 为这个类动态创建一个子类
        enhancer.setSuperclass(t.getClass());

        // 3 设置回调
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o,
                                    Method method,
                                    Object[] objects,
                                    MethodProxy methodProxy) throws Throwable {
                System.out.println("cglib 增强的部分");

                Object res = methodProxy.invokeSuper(o, objects);

                System.out.println("cglib 增强的部分");
                return res;
            }
        });


        Object o = enhancer.create();
        return (T) o;
    }
}

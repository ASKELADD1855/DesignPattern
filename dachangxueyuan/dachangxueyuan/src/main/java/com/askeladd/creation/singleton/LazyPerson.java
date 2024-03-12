package com.askeladd.creation.singleton;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/17 13:59
 * @PackageName:com.askeladd.creation.singleton
 * @ClassName: LazyPerson
 * @Description: TODO
 * @Version 1.0
 */
public class LazyPerson {

    private String name;
    private String age;

    private volatile static LazyPerson instance;    // volatile是添加内存可见性 -- 在getInstance3中用到

    private LazyPerson(){
        System.out.println("LazyPerson() is called");
    }

    public static LazyPerson getInstance1(){
        if(instance == null){   // 可能有多线程的问题
            instance = new LazyPerson();
        }

        return instance;
    }

    // 1 加锁 -- 但是锁太大
    public static synchronized LazyPerson getInstance2(){
        if(instance == null)    instance = new LazyPerson();

        return instance;
    }

    // 2 双重检查锁 + 内存可见性
    public static LazyPerson getInstance3(){

        // 如果没有再去创建
        if(instance == null){
            // 双重检查 -- 多线程问题
            synchronized (LazyPerson.class){
                if(instance == null)    instance = new LazyPerson();
            }

        }

        return instance;
    }
}

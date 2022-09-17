package com.askeladd.creation.factory.abstractFactory;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/17 16:53
 * @PackageName:com.askeladd.creation.factory.abstractFactory
 * @ClassName: Van
 * @Description: TODO
 * @Version 1.0
 */
public class Van extends Car{
    @Override
    public void run() {
        System.out.println("van is running");
    }
}

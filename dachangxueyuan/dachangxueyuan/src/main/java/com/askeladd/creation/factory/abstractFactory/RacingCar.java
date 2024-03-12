package com.askeladd.creation.factory.abstractFactory;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/17 16:54
 * @PackageName:com.askeladd.creation.factory.abstractFactory
 * @ClassName: RacingCar
 * @Description: TODO
 * @Version 1.0
 */
public class RacingCar extends Car{
    @Override
    public void run() {
        System.out.println("racing car is running");
    }
}

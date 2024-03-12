package com.askeladd.creation.factory.factorymethod;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/17 16:51
 * @PackageName:com.askeladd.creation.factory.factorymethod
 * @ClassName: MainTest
 * @Description: TODO
 * @Version 1.0
 */
public class MainTest {

    public static void main(String[] args) {
        WuLinFactory factory = new WuLinVanFactory();
        factory.newCar().run();
        factory = new WuLinRacingCarFactory();
        factory.newCar().run();
    }
}

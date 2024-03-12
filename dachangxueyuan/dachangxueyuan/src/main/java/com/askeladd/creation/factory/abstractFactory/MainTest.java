package com.askeladd.creation.factory.abstractFactory;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/17 16:58
 * @PackageName:com.askeladd.creation.factory.abstractFactory
 * @ClassName: MainTest
 * @Description: TODO
 * @Version 1.0
 */
public class MainTest {

    public static void main(String[] args) {
        WuLinFactory factory = new WuLinN95Factory();
        factory.newMask().protect();
        new WuLinCommonFactory().newMask().protect();
        new WuLinVanFactory().newCar().run();
        new WuLinRacingFactory().newCar().run();
    }
}

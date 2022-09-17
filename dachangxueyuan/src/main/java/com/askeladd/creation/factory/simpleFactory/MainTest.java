package com.askeladd.creation.factory.simpleFactory;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/17 15:47
 * @PackageName:com.askeladd.creation.factory.simpleFactory
 * @ClassName: MainTest
 * @Description: TODO
 * @Version 1.0
 */
public class MainTest {

    public static void main(String[] args) {
        WuLinSimpleFactory factory = new WuLinSimpleFactory();
        factory.newCar("van").run();
        factory.newCar("mini").run();
    }
}

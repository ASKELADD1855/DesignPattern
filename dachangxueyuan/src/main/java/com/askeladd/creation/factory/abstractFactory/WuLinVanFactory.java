package com.askeladd.creation.factory.abstractFactory;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/17 16:56
 * @PackageName:com.askeladd.creation.factory.abstractFactory
 * @ClassName: WuLinVanFactory
 * @Description: TODO
 * @Version 1.0
 */
public class WuLinVanFactory extends WuLinFactory{
    @Override
    public Car newCar() {
        return new Van();
    }

    @Override
    public Mask newMask() {
        return null;
    }
}

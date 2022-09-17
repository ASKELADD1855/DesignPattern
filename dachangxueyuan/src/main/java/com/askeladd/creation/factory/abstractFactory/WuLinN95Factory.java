package com.askeladd.creation.factory.abstractFactory;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/17 16:57
 * @PackageName:com.askeladd.creation.factory.abstractFactory
 * @ClassName: WuLinN95Factory
 * @Description: TODO
 * @Version 1.0
 */
public class WuLinN95Factory extends WuLinFactory{
    @Override
    public Car newCar() {
        return null;
    }

    @Override
    public Mask newMask() {
        return new N95();
    }
}

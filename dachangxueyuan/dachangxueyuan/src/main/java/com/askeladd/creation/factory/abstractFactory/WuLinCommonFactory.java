package com.askeladd.creation.factory.abstractFactory;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/17 16:58
 * @PackageName:com.askeladd.creation.factory.abstractFactory
 * @ClassName: WuLinCommonFactory
 * @Description: TODO
 * @Version 1.0
 */
public class WuLinCommonFactory extends WuLinFactory{
    @Override
    public Car newCar() {
        return null;
    }

    @Override
    public Mask newMask() {
        return new CommonMask();
    }
}

package com.askeladd.creation.factory.abstractFactory;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/17 16:57
 * @PackageName:com.askeladd.creation.factory.abstractFactory
 * @ClassName: WuLinRacingFactory
 * @Description: TODO
 * @Version 1.0
 */
public class WuLinRacingFactory extends WuLinFactory{
    @Override
    public Car newCar() {
        return new RacingCar();
    }

    @Override
    public Mask newMask() {
        return null;
    }
}

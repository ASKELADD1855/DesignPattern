package com.askeladd.creation.factory.factorymethod;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/17 16:50
 * @PackageName:com.askeladd.creation.factory.factorymethod
 * @ClassName: WuLinRacingCarFactory
 * @Description: TODO
 * @Version 1.0
 */
public class WuLinRacingCarFactory extends WuLinFactory{
    @Override
    public Car newCar() {
        return new RacingCar();
    }
}

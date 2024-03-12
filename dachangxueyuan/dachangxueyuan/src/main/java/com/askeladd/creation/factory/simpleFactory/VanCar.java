package com.askeladd.creation.factory.simpleFactory;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/17 15:43
 * @PackageName:com.askeladd.creation.factory.simpleFactory
 * @ClassName: VanCar
 * @Description: TODO
 * @Version 1.0
 */
public class VanCar extends AbstractCar{
    public VanCar(){
        this.engine = "van engine";
    }

    @Override
    public void run() {
        System.out.println(this.engine + "is running");
    }
}

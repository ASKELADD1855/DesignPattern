package com.askeladd.creation.factory.simpleFactory;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/17 15:46
 * @PackageName:com.askeladd.creation.factory.simpleFactory
 * @ClassName: MiniCar
 * @Description: TODO
 * @Version 1.0
 */
public class MiniCar extends AbstractCar{
    public MiniCar(){
        this.engine = "mini engine";
    }

    @Override
    public void run() {
        System.out.println(this.engine+"is running");
    }
}

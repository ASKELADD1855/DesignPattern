package com.askeladd.creation.factory.abstractFactory;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/17 16:54
 * @PackageName:com.askeladd.creation.factory.abstractFactory
 * @ClassName: CommonMask
 * @Description: TODO
 * @Version 1.0
 */
public class CommonMask extends Mask{
    @Override
    public void protect() {
        System.out.println("CommonMask is protecting");
    }
}

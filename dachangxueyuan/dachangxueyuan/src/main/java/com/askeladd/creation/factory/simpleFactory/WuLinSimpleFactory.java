package com.askeladd.creation.factory.simpleFactory;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/17 15:45
 * @PackageName:com.askeladd.creation.factory.simpleFactory
 * @ClassName: WuLinSimpleFactory
 * @Description: TODO
 * @Version 1.0
 */
public class WuLinSimpleFactory {

    // 核心方法: 一切从简
    public AbstractCar newCar(String type){
        if("van".equals(type)){
            return new VanCar();
        }else if("mini".equals(type)){
            return new MiniCar();
        }

        // 。。。。。

        // 更多的产品,违反开闭原则, 应该

        return null;
    }

}

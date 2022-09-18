package com.askeladd.structural.flyweight;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 23:19
 * @PackageName:com.askeladd.structural.flyweight
 * @ClassName: AbstractFlyWeight
 * @Description: TODO
 * @Version 1.0
 */
public abstract class AbstractFlyWeight {

    boolean canService = true; // 能否服务

    abstract void service();

    abstract void end();

    public boolean isCanService(){
        return canService;
    }
}

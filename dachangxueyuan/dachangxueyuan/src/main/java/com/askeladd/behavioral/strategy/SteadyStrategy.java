package com.askeladd.behavioral.strategy;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 23:55
 * @PackageName:com.askeladd.behavioral.strategy
 * @ClassName: SteadyStrategy
 * @Description: TODO
 * @Version 1.0
 */
public class SteadyStrategy implements GameStrategy{
    @Override
    public void doStrategy() {
        System.out.println("do the steady strategy");
    }
}

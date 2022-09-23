package com.askeladd.behavioral.strategy;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 23:55
 * @PackageName:com.askeladd.behavioral.strategy
 * @ClassName: RiskyStrategy
 * @Description: TODO
 * @Version 1.0
 */
public class RiskyStrategy implements GameStrategy{
    @Override
    public void doStrategy() {
        System.out.println("do the risky one ");
    }
}

package com.askeladd.behavioral.state;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/19 0:05
 * @PackageName:com.askeladd.behavioral.state
 * @ClassName: BadState
 * @Description: TODO
 * @Version 1.0
 */
public class BadState implements TeamState{
    @Override
    public void playGame() {
        System.out.println("bad game");
    }

    @Override
    public TeamState next() {
        return new GoodState();
    }
}

package com.askeladd.behavioral.state;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/19 0:06
 * @PackageName:com.askeladd.behavioral.state
 * @ClassName: MiddleState
 * @Description: TODO
 * @Version 1.0
 */
public class MiddleState implements TeamState{
    @Override
    public void playGame() {
        System.out.println("middle game");
    }

    @Override
    public TeamState next() {
        return new BadState();
    }
}

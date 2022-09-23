package com.askeladd.behavioral.state;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/19 0:04
 * @PackageName:com.askeladd.behavioral.state
 * @ClassName: GoodState
 * @Description: TODO
 * @Version 1.0
 */
public class GoodState implements TeamState{


    @Override
    public void playGame() {
        System.out.println("good Game");
    }

    @Override
    public TeamState next() {
        return new MiddleState();
    }


}

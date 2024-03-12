package com.askeladd.behavioral.state;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/19 0:03
 * @PackageName:com.askeladd.behavioral.state
 * @ClassName: TeamState
 * @Description: TODO
 * @Version 1.0
 */
public interface TeamState {

    void playGame();

    TeamState next();
}

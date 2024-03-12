package com.askeladd.behavioral.state;

import lombok.Data;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/19 0:08
 * @PackageName:com.askeladd.behavioral.state
 * @ClassName: MyTeam
 * @Description: TODO
 * @Version 1.0
 */
@Data
public class MyTeam {
    private TeamState state;

    void startGame(){

        state.playGame();
    }

    MyTeam nextState(){
        this.state = state.next();
        return this;
    }
}

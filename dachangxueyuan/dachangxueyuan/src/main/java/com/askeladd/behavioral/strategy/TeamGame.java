package com.askeladd.behavioral.strategy;

import lombok.Data;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 23:56
 * @PackageName:com.askeladd.behavioral.strategy
 * @ClassName: TeamGame
 * @Description: TODO
 * @Version 1.0
 */
@Data
public class TeamGame {
    private GameStrategy strategy;

    void doGame(){
        System.out.println("game begin");
        strategy.doStrategy();
        System.out.println("game over");
    }
}

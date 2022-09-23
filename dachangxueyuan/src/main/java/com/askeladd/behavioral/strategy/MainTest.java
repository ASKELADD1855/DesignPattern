package com.askeladd.behavioral.strategy;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 23:57
 * @PackageName:com.askeladd.behavioral.strategy
 * @ClassName: MainTest
 * @Description: TODO
 * @Version 1.0
 */
public class MainTest {

    public static void main(String[] args) {
        TeamGame teamGame = new TeamGame();
        teamGame.setStrategy(new RiskyStrategy());
        teamGame.doGame();
    }
}

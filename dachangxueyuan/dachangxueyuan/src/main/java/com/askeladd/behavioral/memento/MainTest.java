package com.askeladd.behavioral.memento;

import java.lang.reflect.InvocationTargetException;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/23 15:00
 * @PackageName:com.askeladd.behavioral.memento
 * @ClassName: MainTest
 * @Description: TODO
 * @Version 1.0
 */
public class MainTest {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        GameRole gameRole = new GameRole();
        gameRole.playGame();
        gameRole.saveGameRecord();
        gameRole.playGame();

        GameRole fromMemoto = gameRole.getFromMemoto(1);
        System.out.println(fromMemoto);
        gameRole.playGame();
    }
}

package com.askeladd.structural.adapter.clazz;

import com.askeladd.structural.adapter.MoviePlayer;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 11:27
 * @PackageName:com.askeladd.structural.adapter.clazz
 * @ClassName: MainTest
 * @Description: TODO
 * @Version 1.0
 */
public class MainTest {

    public static void main(String[] args) {
        odd();

        MoviePlayer player = new MoviePlayer();
        JPMoviePlayerAdapter newPlayerWithAdapter = new JPMoviePlayerAdapter(player);
        newPlayerWithAdapter.play();
    }

    public static void odd(){
        new MoviePlayer().play();
        System.out.println("===============odd============\n\n");
    }
}

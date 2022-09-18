package com.askeladd.structural.adapter.obj;

import com.askeladd.structural.adapter.MoviePlayer;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 11:32
 * @PackageName:com.askeladd.structural.adapter.obj
 * @ClassName: MainTest
 * @Description: TODO
 * @Version 1.0
 */
public class MainTest {

    public static void main(String[] args) {
        MoviePlayer moviePlayer = new MoviePlayer();
        new JPMovieAdapter(moviePlayer).play();
    }
}

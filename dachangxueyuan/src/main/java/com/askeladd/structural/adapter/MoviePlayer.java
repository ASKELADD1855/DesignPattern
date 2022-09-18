package com.askeladd.structural.adapter;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 11:13
 * @PackageName:com.askeladd.structural.adapter
 * @ClassName: MoviePlayer
 * @Description: TODO
 * @Version 1.0
 */
public class MoviePlayer implements Player{
    @Override
    public String play() {

        System.out.println("MoviePlayer play() is called");
        return "电影正在播放";
    }
}

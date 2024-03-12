package com.askeladd.structural.adapter;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 11:17
 * @PackageName:com.askeladd.structural.adapter
 * @ClassName: MainTest
 * @Description: TODO
 * @Version 1.0
 */
public class MainTest {

    public static void main(String[] args) {
        odd();  // 想要同时调用两个接口的功能;   但是没有设计相应的形参传递
        // 通过 适配器 来实现 两个接口的的调用

    }

    public static void odd(){
        // 需求就是 播放电影同时翻译字幕
        String play = new MoviePlayer().play();
        new Zh_JPTranslator().translate(play);
        System.out.println("===============================\n");
    }


}

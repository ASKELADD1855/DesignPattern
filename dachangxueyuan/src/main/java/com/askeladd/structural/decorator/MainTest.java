package com.askeladd.structural.decorator;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 16:44
 * @PackageName:com.askeladd.structural.decorator
 * @ClassName: MainTest
 * @Description: TODO
 * @Version 1.0
 */
public class MainTest {

    public static void main(String[] args) {
        ManTikTok mokeTiktok = new MokeTiktok();
        MeiYanDecorator meiYanDecorator = new MeiYanDecorator(mokeTiktok);
        meiYanDecorator.tiktok();
    }
}

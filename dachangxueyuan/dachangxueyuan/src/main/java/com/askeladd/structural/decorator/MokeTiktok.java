package com.askeladd.structural.decorator;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 16:42
 * @PackageName:com.askeladd.structural.decorator
 * @ClassName: MokeTiktok
 * @Description: TODO
 * @Version 1.0
 */
public class MokeTiktok implements ManTikTok{
    @Override
    public void tiktok() {
        System.out.println("MokeTiktok tiktok() is called");
    }
}

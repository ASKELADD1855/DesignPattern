package com.askeladd.structural.decorator;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 16:40
 * @PackageName:com.askeladd.structural.decorator
 * @ClassName: MeiYanDecorator
 * @Description: TODO
 * @Version 1.0
 */
public class MeiYanDecorator implements TikTokDecorator{

    private ManTikTok manTikTok;

    public MeiYanDecorator(ManTikTok manTikTok){
        this.manTikTok = manTikTok;
    }

    @Override
    public void tiktok() {
        enable();
        manTikTok.tiktok();
    }

    @Override
    public void enable() {
        System.out.println("在执行tiktok方法之前,开启美颜效果");
    }
}

package com.askeladd.structural.proxy.staticProxy;

import com.askeladd.structural.decorator.ManTikTok;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 16:57
 * @PackageName:com.askeladd.structural.proxy
 * @ClassName: TiktokProxy
 * @Description: TODO
 * @Version 1.0
 */
public class TiktokProxy implements ManTikTok {
    // 代理一般都是和被代理对象属于同一个接口
    private ManTikTok manTikTok;    // 被代理对象

    public TiktokProxy(ManTikTok manTikTok){
        this.manTikTok = manTikTok;
    }

    @Override
    public void tiktok() {
        System.out.println("代理对象 可以 替换或者增强");   // 增强功能
//        manTikTok.tiktok();

    }
}

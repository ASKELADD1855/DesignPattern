package com.askeladd.structural.proxy.staticProxy;

import com.askeladd.structural.decorator.ManTikTok;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 16:53
 * @PackageName:com.askeladd.structural.proxy
 * @ClassName: MokeTiktok
 * @Description: TODO
 * @Version 1.0
 */
public class MokeTiktok implements ManTikTok {
    // 主体Subject
    @Override
    public void tiktok() {
        System.out.println("tiktok() in MokeTiktok is called");
    }
}

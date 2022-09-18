package com.askeladd.structural.proxy.dynamic;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 17:33
 * @PackageName:com.askeladd.structural.proxy.dynamic
 * @ClassName: MokeTiktok
 * @Description: TODO
 * @Version 1.0
 */
public class MokeTiktok implements ManTiktok,SellTiktok{
    @Override
    public void tiktok() {
        System.out.println("tiktok() in the MokeTiktok is called");
    }

    @Override
    public void sell() {
        System.out.println("sell() in the MokeTiktok is called");
    }
}

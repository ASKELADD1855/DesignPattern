package com.askeladd.structural.proxy.dynamic;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 17:32
 * @PackageName:com.askeladd.structural.proxy.dynamic
 * @ClassName: MainTest
 * @Description: TODO
 * @Version 1.0
 */
public class MainTest {

    public static void main(String[] args) {
        ManTiktok mokeTiktok = new MokeTiktok();

        // 动态代理
        ManTiktok proxy = MyJdkDynamicProxy.getProxy(mokeTiktok);
        proxy.tiktok();

        ((SellTiktok)proxy).sell();
    }
}

package com.askeladd.structural.proxy.cglib;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 18:22
 * @PackageName:com.askeladd.structural.proxy.cglib
 * @ClassName: CglibTest
 * @Description: TODO
 * @Version 1.0
 */
public class CglibTest {

    public static void main(String[] args) {
        MokeTiktok mokeTiktok = new MokeTiktok();
        MokeTiktok proxy = CglibProxy.createProxy(mokeTiktok);

        proxy.tiktok();
    }
}

package com.askeladd.structural.proxy.staticProxy;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 17:00
 * @PackageName:com.askeladd.structural.proxy
 * @ClassName: ManTest
 * @Description: TODO
 * @Version 1.0
 */
public class ManTest {

    public static void main(String[] args) {
        testStatic();


    }

    public static void testStatic(){
        TiktokProxy tiktokProxy = new TiktokProxy(new MokeTiktok());
        tiktokProxy.tiktok();
        System.out.println("==============静态代理测试===================\n\n");
    }
}

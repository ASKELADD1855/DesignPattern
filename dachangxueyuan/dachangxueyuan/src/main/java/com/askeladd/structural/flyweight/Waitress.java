package com.askeladd.structural.flyweight;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 23:20
 * @PackageName:com.askeladd.structural.flyweight
 * @ClassName: Waitress
 * @Description: TODO
 * @Version 1.0
 */
public class Waitress extends AbstractFlyWeight{
    String id;
    String name;
    int age;

    @Override
    void service() {
        System.out.println("工号"+id+"--"+name+"--"+age+" 正在为您服务");

        this.canService = false;
    }

    @Override
    void end() {
        System.out.println("工号"+id+"--"+name+"--"+age+" 服务结束");

        this.canService = true;
    }
}

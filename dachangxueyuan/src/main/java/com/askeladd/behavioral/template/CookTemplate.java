package com.askeladd.behavioral.template;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 23:38
 * @PackageName:com.askeladd.behavioral.template
 * @ClassName: CookTemplate
 * @Description: TODO
 * @Version 1.0
 */
public abstract class CookTemplate {
    public void cook(){
        heating();
        addfood();
        addsalt();
        stirfry();
        end();
    }

    void heating(){System.out.println("开火...");}

    public abstract void addfood();

    public abstract void addsalt();

    public void stirfry(){
        System.out.println("翻炒中...");
    }

    public void end(){
        System.out.println("出锅...");
    }
}

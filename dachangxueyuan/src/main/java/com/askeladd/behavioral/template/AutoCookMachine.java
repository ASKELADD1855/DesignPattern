package com.askeladd.behavioral.template;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 23:38
 * @PackageName:com.askeladd.behavioral.template
 * @ClassName: AutoCookMachine
 * @Description: TODO
 * @Version 1.0
 */
public class AutoCookMachine extends CookTemplate{


    @Override
    public void addfood() {
        System.out.println("addfood() in the AutoCookMachine is called");
    }

    @Override
    public void addsalt() {
        System.out.println("addsalt() in the AutoCookMachine is called");
    }
}

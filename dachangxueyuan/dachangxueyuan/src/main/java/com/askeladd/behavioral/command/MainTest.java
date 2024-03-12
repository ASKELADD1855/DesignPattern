package com.askeladd.behavioral.command;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/23 17:28
 * @PackageName:com.askeladd.behavioral.command
 * @ClassName: MainTest
 * @Description: TODO
 * @Version 1.0
 */
public class MainTest {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.setCommand(new CommandType1());
        invoker.call();
    }
}

package com.askeladd.behavioral.command;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/23 17:25
 * @PackageName:com.askeladd.behavioral.command
 * @ClassName: CommandType1
 * @Description: TODO
 * @Version 1.0
 */
public class CommandType1 implements Command{
    private Receiver moke = new Receiver();

    @Override
    public void execute() {
        System.out.println("调用了CommandType1 的 execute()");
        moke.doCommand1();
    }
}

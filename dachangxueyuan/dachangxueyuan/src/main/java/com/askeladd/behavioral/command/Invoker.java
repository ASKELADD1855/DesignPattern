package com.askeladd.behavioral.command;

import lombok.Data;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/23 17:27
 * @PackageName:com.askeladd.behavioral.command
 * @ClassName: Invoker
 * @Description: TODO
 * @Version 1.0
 */
@Data
public class Invoker {
    Command command;

    public void call(){
        command.execute();
    }
}

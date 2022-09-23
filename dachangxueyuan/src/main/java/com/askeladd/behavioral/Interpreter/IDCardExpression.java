package com.askeladd.behavioral.Interpreter;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/23 16:06
 * @PackageName:com.askeladd.behavioral.Interpreter
 * @ClassName: IDCardExpression
 * @Description: TODO
 * @Version 1.0
 */
public abstract class IDCardExpression {
    // 1  抽象表达式
    abstract boolean interpret(String expression);
}

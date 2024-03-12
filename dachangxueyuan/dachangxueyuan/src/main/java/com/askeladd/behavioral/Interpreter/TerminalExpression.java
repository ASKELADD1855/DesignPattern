package com.askeladd.behavioral.Interpreter;

import java.util.Set;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/23 16:09
 * @PackageName:com.askeladd.behavioral.Interpreter
 * @ClassName: TerminalExpression
 * @Description: TODO
 * @Version 1.0
 */
public class TerminalExpression extends IDCardExpression{
    IDCardExpression childExp;

    Set<String> data;
    String symbol;

    public TerminalExpression(Set<String> data,String symbol){
        this.data = data;
        this.symbol = symbol;
    }


    @Override
    boolean interpret(String expression) {
        String[] split = expression.split(symbol);

        for (String s : split) {
            if(data.contains(s))    return true;
        }

        return false;
    }
}

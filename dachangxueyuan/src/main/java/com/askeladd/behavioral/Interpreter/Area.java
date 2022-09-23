package com.askeladd.behavioral.Interpreter;

import java.util.HashSet;
import java.util.Set;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/23 16:12
 * @PackageName:com.askeladd.behavioral.Interpreter
 * @ClassName: Area
 * @Description: TODO
 * @Version 1.0
 */
public class Area {
    Set<String> city = new HashSet<>();
    Set<String> type = new HashSet<>();
    IDCardExpression idCardReader;

    public Area(){
        city.add("上海");city.add("武汉");city.add("北京");
        type.add("学生");type.add("老师");type.add("医生");

        TerminalExpression terminalExpression = new TerminalExpression(this.city, ":");
        TerminalExpression terminalExpression1 = new TerminalExpression(this.type, "-");

//        idCardReader = new OrExpression(city, type);
    }

}

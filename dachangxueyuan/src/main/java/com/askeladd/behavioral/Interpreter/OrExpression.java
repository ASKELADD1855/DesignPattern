package com.askeladd.behavioral.Interpreter;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/23 16:07
 * @PackageName:com.askeladd.behavioral.Interpreter
 * @ClassName: OrExpression
 * @Description: TODO
 * @Version 1.0
 */
public class OrExpression extends IDCardExpression{

    // 组合两个终结表达式。最终的判断结果 是 终结
    private IDCardExpression cityExp;
    private IDCardExpression typeExp;

    public OrExpression(IDCardExpression cityExp,IDCardExpression typeExp){
        this.cityExp = cityExp;
        this.typeExp = typeExp;
    }

    @Override
    boolean interpret(String expression) {
        return cityExp.interpret(expression) || typeExp.interpret(expression);
    }
}

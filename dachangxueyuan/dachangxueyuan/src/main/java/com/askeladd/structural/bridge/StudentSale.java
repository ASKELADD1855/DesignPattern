package com.askeladd.structural.bridge;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 12:37
 * @PackageName:com.askeladd.structural.bridge
 * @ClassName: StudentSale
 * @Description: TODO
 * @Version 1.0
 */
public class StudentSale extends AbstractSale{
    public StudentSale(String type, Integer price) {
        super("学生", price);
    }
}

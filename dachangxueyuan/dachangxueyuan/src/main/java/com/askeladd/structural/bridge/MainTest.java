package com.askeladd.structural.bridge;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 12:37
 * @PackageName:com.askeladd.structural.bridge
 * @ClassName: MainTest
 * @Description: TODO
 * @Version 1.0
 */
public class MainTest {

    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        iPhone.setSale(new StudentSale(null,1000));
        System.out.println(iPhone.getPhone());
        iPhone.setSale(new OnlineSale(null,2000));
        System.out.println(iPhone.getPhone());


    }
}

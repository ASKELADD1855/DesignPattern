package com.askeladd.behavioral.chain;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/23 21:36
 * @PackageName:com.askeladd.behavioral.chain
 * @ClassName: MainTest
 * @Description: TODO
 * @Version 1.0
 */
public class MainTest {

    public static void main(String[] args) {
        Teacher moke3 = new Teacher("moke3");
        Teacher moke2 = new Teacher("moke2", moke3);
        Teacher moke1 = new Teacher("moke1",moke2);

        moke1.handleRequest();
    }
}

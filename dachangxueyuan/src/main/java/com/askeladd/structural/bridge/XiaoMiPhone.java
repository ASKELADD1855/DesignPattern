package com.askeladd.structural.bridge;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 12:38
 * @PackageName:com.askeladd.structural.bridge
 * @ClassName: XiaoMiPhone
 * @Description: TODO
 * @Version 1.0
 */
public class XiaoMiPhone extends AbstractPhone{
    @Override
    String getPhone() {
        return "MiPhone"+sale.getSaleInfo();
    }
}

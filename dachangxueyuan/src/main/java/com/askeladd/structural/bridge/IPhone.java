package com.askeladd.structural.bridge;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 12:37
 * @PackageName:com.askeladd.structural.bridge
 * @ClassName: IPhone
 * @Description: TODO
 * @Version 1.0
 */
public class IPhone extends AbstractPhone{
    @Override
    String getPhone() {
        return "IPhone: "+sale.getSaleInfo();
    }
}

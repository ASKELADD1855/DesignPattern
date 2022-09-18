package com.askeladd.structural.bridge;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 12:36
 * @PackageName:com.askeladd.structural.bridge
 * @ClassName: OnlineSale
 * @Description: TODO
 * @Version 1.0
 */
public class OnlineSale extends AbstractSale{
    public OnlineSale(String type, Integer price) {
        super("线上", price);
    }
}

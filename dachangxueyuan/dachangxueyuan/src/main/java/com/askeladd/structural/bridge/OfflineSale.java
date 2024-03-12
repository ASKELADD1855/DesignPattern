package com.askeladd.structural.bridge;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 12:35
 * @PackageName:com.askeladd.structural.bridge
 * @ClassName: OfflineSale
 * @Description: TODO
 * @Version 1.0
 */
public class OfflineSale extends AbstractSale{
    public OfflineSale(String type, Integer price) {
        super("线下", price);
    }
}

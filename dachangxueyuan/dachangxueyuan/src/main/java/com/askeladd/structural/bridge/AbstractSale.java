package com.askeladd.structural.bridge;

import lombok.AllArgsConstructor;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 12:30
 * @PackageName:com.askeladd.structural.bridge
 * @ClassName: AbstractSale
 * @Description: TODO
 * @Version 1.0
 */
@AllArgsConstructor
public abstract class AbstractSale {

    private String type;
    private Integer price;

    String getSaleInfo(){
        return "渠道 = " +type +"; 价格 = " + price;
    }
}

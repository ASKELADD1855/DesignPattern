package com.askeladd.structural.bridge;

import lombok.Data;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 12:33
 * @PackageName:com.askeladd.structural.bridge
 * @ClassName: AbstractPhone
 * @Description: TODO
 * @Version 1.0
 */
@Data
public abstract class AbstractPhone {
    // 桥接在此 ..... 设计期间就得想好
    // 真正会引起 此类变化的一个维度 直接抽取出来 ; 通过组合的方式接起来
    //  桥接 + 适配器
    AbstractSale sale;  // 分离渠道

    // 当前手机的描述
    abstract String getPhone();
}

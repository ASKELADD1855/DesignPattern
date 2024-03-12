package com.askeladd.creation.prototype;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/17 14:22
 * @PackageName:com.askeladd.creation.prototype
 * @ClassName: MainTest
 * @Description: TODO
 * @Version 1.0
 */


/*
*   是用于创建重复的对象,同时又能保证性能
*   1 MokeMyBatis --> 操纵数据库,从数据库里面查出很多记录 (70%)
*   2 每次查数据库,查到以后把所有数据都封装到一个对象,返回
*       10000 thread中 --> 10000 个 重复的对象
*   3 解决方法: 缓存;查过的保存
*       如果再查相同的记录,拿到原来的原型对象
* */
public class MainTest {
    public static MokeMyBatis mybatis = new MokeMyBatis();

    public static void main(String[] args) throws CloneNotSupportedException {
        User zhangsan = mybatis.getUser("zhangsan");
        System.out.println(zhangsan);
        zhangsan.setUsername("moke");
        System.out.println(zhangsan);

        User zhangsan1 = mybatis.getUser("zhangsan");
        System.out.println(zhangsan1);

        User zhangsan2 = mybatis.getUser("zhangsan");
        System.out.println(zhangsan2);
    }
}

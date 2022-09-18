package com.askeladd.structural.flyweight;

import com.sun.javafx.runtime.async.AbstractAsyncOperation;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 23:22
 * @PackageName:com.askeladd.structural.flyweight
 * @ClassName: ZuDao
 * @Description: TODO
 * @Version 1.0
 */
public class ZuDao {

    private static Map<String,AbstractFlyWeight> pool = new HashMap<>();

    // 享元,池子中有对象
    static {


    }

    public void addMember(AbstractFlyWeight member){
        pool.put(UUID.randomUUID().toString(),member);
    }

    public static AbstractFlyWeight getMember(String name){
        AbstractFlyWeight flyWeight = pool.get(name);

        if(flyWeight == null){
            for (AbstractFlyWeight value : pool.values()) {
                if(value.isCanService()){
                    return value;
                }
            }
        }

        return flyWeight;
    }


}

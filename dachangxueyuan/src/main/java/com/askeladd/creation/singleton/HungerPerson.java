package com.askeladd.creation.singleton;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/17 13:57
 * @PackageName:com.askeladd.creation.singleton
 * @ClassName: HungerPerson
 * @Description: TODO
 * @Version 1.0
 */
public class HungerPerson {
    private String name;
    private String age;

    private static HungerPerson instance = new HungerPerson();

    private HungerPerson(){
        System.out.println("HungerPerson is created");
    }

    public HungerPerson getInstance(){
        return instance;
    }
}

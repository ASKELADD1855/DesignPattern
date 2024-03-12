package com.askeladd.creation.builder;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/17 17:26
 * @PackageName:com.askeladd.creation.builder
 * @ClassName: AbstractBuilder
 * @Description: TODO
 * @Version 1.0
 */
public abstract class AbstractBuilder {

    Phone phone;

    abstract AbstractBuilder customCpu(String cpu);
    abstract AbstractBuilder customMem(String mem);
    abstract AbstractBuilder customDisk(String disk);
    abstract AbstractBuilder customCam(String cam);


    Phone getProduct(){
        return phone;
    }
}

package com.askeladd.creation.builder;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/17 17:27
 * @PackageName:com.askeladd.creation.builder
 * @ClassName: XiaoMiBuilder
 * @Description: TODO
 * @Version 1.0
 */
public class XiaoMiBuilder extends AbstractBuilder{

    public XiaoMiBuilder(){
        this.phone = new Phone();
    }

    @Override
    AbstractBuilder customCpu(String cpu) {
        phone.setCpu(cpu);
        return this;
    }

    @Override
    AbstractBuilder customMem(String mem) {
        phone.setMem(mem);
        return this;
    }

    @Override
    AbstractBuilder customDisk(String disk) {
        phone.setDisk(disk);
        return this;
    }

    @Override
    AbstractBuilder customCam(String cam) {
        phone.setCam(cam);
        return this;
    }
}

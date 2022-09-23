package com.askeladd.behavioral.chain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/23 21:29
 * @PackageName:com.askeladd.behavioral.chain
 * @ClassName: Teacher
 * @Description: TODO
 * @Version 1.0
 */
@Data
@AllArgsConstructor
public class Teacher {

    private String name;
    private Teacher next;

    public Teacher(String name){
        this.name = name;
    }

    void handleRequest(){
        System.out.println(this + "正在处理...");

        if(next != null)    next.handleRequest();   // 链式调用
    }

    public String toString(){
        return "Teacher{ "+
                "name="+name+
                " }";
    }
}
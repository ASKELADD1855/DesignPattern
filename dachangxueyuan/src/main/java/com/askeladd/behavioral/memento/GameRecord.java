package com.askeladd.behavioral.memento;

import lombok.Data;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/23 14:50
 * @PackageName:com.askeladd.behavioral.memento
 * @ClassName: GameRecord
 * @Description: TODO
 * @Version 1.0
 */
@Data
public class GameRecord {
    // 备忘录
    Integer id;
    Integer coin;
    Integer hp;
    Integer mp;
    Integer level;

    // 获取当前 - 备忘录信息
    void getCurrent(){
        System.out.println("coin: "+coin+" --- "+"hp: "+hp+" --- "+"mp: "+mp+" --- "+"level: "+level);
    }
}

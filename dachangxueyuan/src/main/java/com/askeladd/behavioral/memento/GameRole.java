package com.askeladd.behavioral.memento;

import lombok.Data;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/23 14:34
 * @PackageName:com.askeladd.behavioral.memento
 * @ClassName: GameRole
 * @Description: TODO
 * @Version 1.0
 */
@Data
public class GameRole {
    // 发起人 - 创建备忘录 + 恢复备忘录
    Integer coin;
    Integer hp;
    Integer mp;
    Integer level;

    GameServer server = new GameServer();

    // 保存游戏记录
    void saveGameRecord() throws InvocationTargetException, IllegalAccessException {
        System.out.println("正在保存当前记录...");
        GameRecord gameRecord = new GameRecord();

        // 将当前内存中的游戏信息 保存到 备忘录中
        BeanUtils.copyProperties(gameRecord,this);
        server.add(gameRecord);
    }

    // 从备忘录获取游戏历史记录
    GameRole getFromMemoto(Integer id) throws InvocationTargetException, IllegalAccessException {
        GameRole record = server.getRecord(id);
        return record;
    }

    void playGame(){
        System.out.println("playing the game");
        Random random = new Random();

        this.coin = random.nextInt();
        this.level = random.nextInt();
        this.hp = random.nextInt();
        this.mp = random.nextInt();
    }

    void exitGame() throws InvocationTargetException, IllegalAccessException {
        System.out.println("退出&存档");
        saveGameRecord();
    }
}

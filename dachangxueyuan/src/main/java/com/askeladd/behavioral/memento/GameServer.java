package com.askeladd.behavioral.memento;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/23 14:45
 * @PackageName:com.askeladd.behavioral.memento
 * @ClassName: GameServer
 * @Description: TODO
 * @Version 1.0
 */
public class GameServer {
    // 管理者 保存备忘录 + 获取备忘录
    Map<Integer,GameRecord> records = new HashMap<>();
    static int i=1;

    void add(GameRecord newRecord){
        newRecord.setId(i++);
        records.put(newRecord.id,newRecord);
    }

    GameRole getRecord(Integer id) throws InvocationTargetException, IllegalAccessException {
        GameRecord gameRecord = records.get(id);

        // 需要填装的对象
        GameRole gameRole = new GameRole();
        BeanUtils.copyProperties(gameRole,gameRecord);

        return gameRole;
    }
}

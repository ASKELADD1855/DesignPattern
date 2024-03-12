package com.askeladd.creation.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/17 15:17
 * @PackageName:com.askeladd.creation.prototype
 * @ClassName: MokeMyBatis
 * @Description: TODO
 * @Version 1.0
 */
public class MokeMyBatis {
    Map<String,User> userCache = new HashMap<String, User>();

    private User getUserFromDB(String username) throws CloneNotSupportedException {
        System.out.println("从数据库查到"+username);

        User user = new User();
        user.setUsername(username);
        user.setAge(18);

        userCache.put(username,(User)user.clone());
        return user;
    }


    public User getUser(String username) throws CloneNotSupportedException {
        User user = null;

        // 缓存中没有
        if(!userCache.containsKey(username)){
            user = getUserFromDB(username);
        }else{
            // 从缓存中直接拿 --> 脏缓存
            // 原型已经拿到,但是不能直接给
            user = userCache.get(username);
            System.out.println("从换从中拿到的");
            // 从这个对象快速得到一个克隆一 == 原型模式
            user = (User)user.clone();
        }

        return user;
    }
}

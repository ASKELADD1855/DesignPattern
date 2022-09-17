package com.askeladd.creation.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/17 15:15
 * @PackageName:com.askeladd.creation.prototype
 * @ClassName: User
 * @Description: TODO
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Cloneable{

    private String username;
    private Integer age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = new User();
        user.setUsername(username);
        user.setAge(age);

        return user;
    }
}

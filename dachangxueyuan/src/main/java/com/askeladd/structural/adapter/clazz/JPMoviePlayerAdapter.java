package com.askeladd.structural.adapter.clazz;

import com.askeladd.structural.adapter.Player;
import com.askeladd.structural.adapter.Zh_JPTranslator;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 11:25
 * @PackageName:com.askeladd.structural.adapter.clazz
 * @ClassName: JPMoviePlayerAdapter
 * @Description: TODO
 * @Version 1.0
 */
public class JPMoviePlayerAdapter extends Zh_JPTranslator implements Player {

    private Player target;  // 被适配对象
    public JPMoviePlayerAdapter(Player target){
        this.target = target;
    }

    @Override
    public String play() {
        String play = target.play();
        String translate = translate(play);
        System.out.println(translate);
        return play;
    }
}

package com.askeladd.structural.adapter.obj;

import com.askeladd.structural.adapter.Player;
import com.askeladd.structural.adapter.Translator;
import com.askeladd.structural.adapter.Zh_JPTranslator;
import com.askeladd.structural.adapter.clazz.JPMoviePlayerAdapter;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 11:30
 * @PackageName:com.askeladd.structural.adapter.obj
 * @ClassName: JPMovieAdapter
 * @Description: TODO
 * @Version 1.0
 */
public class JPMovieAdapter implements Player {

    // 组合的方式
    private Translator translator = new Zh_JPTranslator();
    private Player target;

    public JPMovieAdapter(Player target){
        this.target = target;
    }

    @Override
    public String play() {
        String play = target.play();
        String translate = translator.translate(play);
        System.out.println(translate);
        return play;
    }
}

package com.askeladd.structural.adapter;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 11:14
 * @PackageName:com.askeladd.structural.adapter
 * @ClassName: Zh_JPTranslator
 * @Description: TODO
 * @Version 1.0
 */
public class Zh_JPTranslator implements Translator{
    @Override
    public String translate(String original) {
        System.out.println("需要翻译的字幕为: "+original);

        return "翻译后的字幕为: good";
    }
}

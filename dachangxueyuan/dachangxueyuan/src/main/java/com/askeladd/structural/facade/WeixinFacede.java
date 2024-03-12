package com.askeladd.structural.facade;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/18 22:00
 * @PackageName:com.askeladd.structural.facade
 * @ClassName: WeixinFacede
 * @Description: TODO
 * @Version 1.0
 */
public class WeixinFacede {
    Police police = new Police();
    Edu edu = new Edu();
    Social social = new Social();

    public void OverallService(){
        police.policeService();
        edu.EducationService();
        social.SocialService();
    }
}

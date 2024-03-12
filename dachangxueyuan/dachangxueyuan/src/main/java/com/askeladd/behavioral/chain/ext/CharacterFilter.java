package com.askeladd.behavioral.chain.ext;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/23 22:16
 * @PackageName:com.askeladd.behavioral.chain.ext
 * @ClassName: CharacterFilter
 * @Description: TODO
 * @Version 1.0
 */
public class CharacterFilter implements Filter{
    @Override
    public void doFilter(Request req, Response rep, FilterChain chain) {
        req.msg += "==========";
        System.out.println("CharacterFilter... doFilter之前");
        chain.doFilter(req,rep,chain);
        System.out.println("CharacterFilter... doFilter之后");
    }
}

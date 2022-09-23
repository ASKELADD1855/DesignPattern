package com.askeladd.behavioral.chain.ext;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/23 22:18
 * @PackageName:com.askeladd.behavioral.chain.ext
 * @ClassName: EncodingFilter
 * @Description: TODO
 * @Version 1.0
 */
public class EncodingFilter implements Filter{
    @Override
    public void doFilter(Request req, Response rep, FilterChain chain) {
        req.msg+=" oooo";
        System.out.println("EncodingFilter...doFilter之前");

        //放行
        chain.doFilter(req,rep,chain);


        System.out.println("EncodingFilter...doFilter之后");
    }
}

package com.askeladd.behavioral.chain.ext;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/23 22:18
 * @PackageName:com.askeladd.behavioral.chain.ext
 * @ClassName: HttpFilter
 * @Description: TODO
 * @Version 1.0
 */
public class HttpFilter implements Filter{
    @Override
    public void doFilter(Request req, Response rep, FilterChain chain) {
        req.msg+=">>>";
        System.out.println("HttpFilter...doFilter之前");
        chain.doFilter(req,rep,chain);
        System.out.println("HttpFilter...doFilter之后");
    }
}

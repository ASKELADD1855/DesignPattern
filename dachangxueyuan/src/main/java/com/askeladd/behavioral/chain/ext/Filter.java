package com.askeladd.behavioral.chain.ext;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/23 22:10
 * @PackageName:com.askeladd.behavioral.chain.ext
 * @ClassName: Filter
 * @Description: TODO
 * @Version 1.0
 */
public interface Filter {

    void doFilter(Request req,Response rep,FilterChain chain);
}

package com.askeladd.behavioral.chain.ext;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/23 22:12
 * @PackageName:com.askeladd.behavioral.chain.ext
 * @ClassName: FilterChain
 * @Description: TODO
 * @Version 1.0
 */
@Data
public class FilterChain implements Filter{

    int cursor = 0;
    List<Filter> filterChain = new ArrayList<>();
    My target;

    void addFilter(Filter filter){filterChain.add(filter);}

    @Override
    public void doFilter(Request req, Response rep,FilterChain chain) {
        if(cursor < filterChain.size()){
            Filter filter = filterChain.get(cursor);
            cursor++;
            filter.doFilter(req,rep,chain);
        }else{
            target.hello();
        }
    }
}

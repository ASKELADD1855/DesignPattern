package com.askeladd.behavioral.chain.ext;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/23 22:16
 * @PackageName:com.askeladd.behavioral.chain.ext
 * @ClassName: MainTest
 * @Description: TODO
 * @Version 1.0
 */
public class MainTest {

    public static void main(String[] args) {
        FilterChain chain = new FilterChain();

        HttpFilter filter = new HttpFilter();
        CharacterFilter characterFilter = new CharacterFilter();
        EncodingFilter encodingFilter = new EncodingFilter();
        chain.addFilter(filter);
        chain.addFilter(characterFilter);
        chain.addFilter(encodingFilter);
        chain.setTarget(new My());

        chain.doFilter(new Request("hello world"),
                new Response("adhkjasdhak"),chain);

    }
}

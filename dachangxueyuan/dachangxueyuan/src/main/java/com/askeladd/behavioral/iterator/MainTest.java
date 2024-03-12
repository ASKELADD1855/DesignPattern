package com.askeladd.behavioral.iterator;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/23 17:47
 * @PackageName:com.askeladd.behavioral.iterator
 * @ClassName: MainTest
 * @Description: TODO
 * @Version 1.0
 */
public class MainTest {

    public static void main(String[] args) {
        Man moke = new Moke();
        moke.add("1");moke.add("2");moke.add("3");moke.add("4");

        Man.itr iterator = moke.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

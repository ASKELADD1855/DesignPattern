package com.askeladd.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/9/23 17:42
 * @PackageName:com.askeladd.behavioral.iterator
 * @ClassName: Man
 * @Description: TODO
 * @Version 1.0
 */
public abstract class Man {

    private List<String> data = new ArrayList<>();

    void add(String name){
        data.add(name);
    }

    void remove(String name){
        data.remove(name);
    }

    public itr getIterator(){
        return new iterator();
    }

    class iterator implements itr{

        private int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor < data.size();
        }

        @Override
        public String next() {
            return data.get(cursor++);
        }

        @Override
        public String firstOne() {
            return data.get(0);
        }

        @Override
        public String current() {
            return data.get(data.size()-1);
        }
    }

    interface itr {
        boolean hasNext();
        String next();
        String firstOne();
        String current();
    }
}

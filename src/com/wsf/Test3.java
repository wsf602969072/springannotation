package com.wsf;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: WangShangfei
 * @date: 2019 -下午 6:45
 * @tel:18738322951
 */
public class Test3 {
    //psf
    private static final int A = 1;
    public static final int  B = 1;
    public static final String str="11";
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //ifn
        if (list == null) {
            System.out.println("list为null");
        }

        //inn
        if (list != null) {
            System.out.println("list不为null");
        }
        //list.nn
        if (list != null) {

        }
        //list.null
        if (list == null) {

        }

    }
}

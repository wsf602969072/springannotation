package com.wsf;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: WangShangfei
 * @date: 2019 -下午 6:39
 * @tel:18738322951
 */
public class Test2 {


    public static void main(String[] args) {
        //fori
        String[] strs = {"111","222","333"};
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
        //iter
        for (String str : strs) {
            System.out.println(str);
        }
        //itar
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            System.out.println(str);
        }

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        //list.for增强for循环
        for (String s : list) {
            System.out.println(s);
        }
        //list.fori正序遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //list.forr倒叙遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}

package com.wsf;


import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    //psvm
    public static void main(String[] args) {
        //sout
        System.out.println("你好");
        //soutp  打印形参
        System.out.println("args = [" + args + "]");
        //soutm  打印方法
        System.out.println("HelloWorld.main");
        //soutv
        System.out.println("args = " + args);
        int num = 1;
        System.out.println("num = " + num);
        //xxx.sout
        System.out.println(num);
    }

    private static void getDate() {
        System.out.println("hello world");
        List<String> list = new ArrayList<>();
        System.out.println(list.size());
    }
}

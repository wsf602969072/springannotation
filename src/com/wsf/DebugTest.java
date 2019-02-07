package com.wsf;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: WangShangfei
 * @date: 2019 -上午 9:42
 * @tel:18738322951
 */
public class DebugTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        Map<String,String> map = new HashMap<>();
        map.put("name","zhangsan");
        map.put("age","12");
        map.put("gender","male");
        String name = map.get("name");
        //name.sout  soutv
        System.out.println(name);
        System.out.println("name = " + name);
        map.remove("age");
        System.out.println(map);
    }
}

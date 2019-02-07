package com.wsf.model;

/**
 * @author: WangShangfei
 * @date: 2019 -下午 4:25
 * @tel:18738322951
 */
public class Student {
    private Integer sid;
    private String name;

    public Student(Integer sid, String name) {
        this.sid = sid;
        this.name = name;
    }

    public Student() {
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                '}';
    }
}

package com.wsf.dao;

import org.springframework.stereotype.Repository;

/**
 * @author: WangShangfei
 * @date: 2019 -下午 11:25
 * @tel:18738322951
 */
@Repository
public class UserDao {
    public String label="1";

    @Override
    public String toString() {
        return "UserDao{" +
                "label='" + label + '\'' +
                '}';
    }
}

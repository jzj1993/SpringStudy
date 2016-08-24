/**
 * Copyright_2006, Liao Xuefeng
 * Created on 2006-3-9
 * <p>
 * For more information, please visit: http://www.crackj2ee.com
 */
package com.jzj.example.spring;

import java.util.*;

public class MyServiceBean implements ServiceBean {

    private Map<String, String> map = new HashMap<String, String>();

    public void addUser(String username, String password) {
        if (!map.containsKey(username))
            map.put(username, password);
        else
            throw new RuntimeException("User already exist.");
    }

    public void deleteUser(String username) {
        if (map.remove(username) == null)
            throw new RuntimeException("User not exist.");
    }

    public boolean findUser(String username) {
        return map.containsKey(username);
    }

    public String getPassword(String username) {
        return map.get(username);
    }
}

/**
 * Copyright_2006, Liao Xuefeng
 * Created on 2006-3-9
 * 
 * For more information, please visit: http://www.crackj2ee.com
 */
package com.jzj.example.spring;

/**
 * Interface of service facade.
 * 
 * @author Xuefeng
 */
public interface ServiceBean {

    void addUser(String username, String password);

    void deleteUser(String username);

    boolean findUser(String username);

    String getPassword(String username);
}

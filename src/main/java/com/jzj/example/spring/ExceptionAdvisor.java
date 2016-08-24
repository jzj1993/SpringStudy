/**
 * Copyright_2006, Liao Xuefeng
 * Created on 2006-3-9
 * For more information, please visit: http://www.crackj2ee.com
 */
package com.jzj.example.spring;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionAdvisor implements ThrowsAdvice {

    public void afterThrowing(RuntimeException re) throws Throwable {
        System.out.println("[Exception] " + re.getMessage());
    }
}

/**
 * Copyright_2006, Liao Xuefeng
 * Created on 2006-3-9
 * For more information, please visit: http://www.crackj2ee.com
 */
package com.jzj.example.spring;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PasswordAdvisor implements MethodInterceptor {

    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object ret = invocation.proceed();
        if(ret==null)
            return null;
        String password = (String)ret;
        StringBuffer encrypt = new StringBuffer(password.length());
        for(int i=0; i<password.length(); i++)
            encrypt.append('*');
        return encrypt.toString();
    }

}

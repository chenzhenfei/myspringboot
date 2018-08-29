package com.example.studyspringboot.proxy.dynamic.cglibproxy;


import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 动态代理：cglib
 */
public class CglibProxy  implements MethodInterceptor {

    private Object object;

    //调用业务类（父类中）的方法
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib 代理开始");
            Object a =methodProxy.invokeSuper(o,objects); //调用业务类（父类中）的方法
        System.out.println("cglib 代理结束");
        return a;
    }

    public Object getInstance(Object obj){
        //1、给业务对象赋值
        this.object =obj;
        //2、创建加强器，用来创建动态代理类
        Enhancer  enHancer =new Enhancer();
        //3、
        enHancer.setSuperclass(this.object.getClass());
        //4
        enHancer.setCallback(this);
        //5
        Object a = enHancer.create();
        return a  ;
    }

}

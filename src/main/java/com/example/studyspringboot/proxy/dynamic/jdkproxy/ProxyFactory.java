package com.example.studyspringboot.proxy.dynamic.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory implements InvocationHandler {

    private Object object;  //代理的类
    public ProxyFactory (Object obj){
        this.object =obj;
    }

    /**
     * 代理方法， 相比静态代理 通过反射机制去实现
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("代理开始");
        Object a =method.invoke(object,args); //
        System.out.println("代理结束");
        return a;
    }


    /**
     * 获取代理带的方法
     * @return
     */
    public Object getInstance(){
        Class clazz =this.object.getClass();
        Object a =Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
        return a;
    }


    /**
     * 获取代理带的方法2 :只是该表了代理目标类的初始化方式
     * @return
     */
    public Object getInstance2(Object obj){
        this.object=obj;
        Class clazz =this.object.getClass();
        Object a =Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
        return a;
    }

}

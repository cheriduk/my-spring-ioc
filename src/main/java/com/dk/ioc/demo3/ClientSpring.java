package com.dk.ioc.demo3;

import com.dk.ioc.framework.ApplicationConext;

/**
 * @title: ClientSpring
 * @projectName my-spring-ioc
 * @Description: TODO
 * @Author Cheri
 * @Date: 2019/5/1 00:18
 */
public class ClientSpring {
    public static void main(String[] args) {
        //实例化上下文
        ApplicationConext context = new ApplicationConext("/applicationContext.xml");
        //根据 id 从容器中获取 Computer 的 bean 对象
        Computer computer = context.getBean("computer");
        //运行主机
        computer.run();
    }
}
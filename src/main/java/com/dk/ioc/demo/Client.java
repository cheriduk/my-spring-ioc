package com.dk.ioc.demo;

/**
 * @title: Client
 * @projectName my-spring-ioc
 * @Description: 测试类
 * @Author Cheri
 * @Date: 2019/4/30 23:36
 */
public class Client {

    public static void main(String[] args) {
        //实例化主机对象
        Computer computer = new Computer();
        //使用主机
        computer.run();
    }
}


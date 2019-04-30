package com.dk.ioc.demo2;

/**
 * @title: Client
 * @projectName my-spring-ioc
 * @Description: 使用者
 * @Author Cheri
 * @Date: 2019/5/1 00:06
 */
public class Client {
    public static void main(String[] args) {
        //先实例化主机对象 此时的主机中是没有显示器对象的
        Computer computer = new Computer();
        //实例化彩色显示器对象
        ColorDisplay display = new ColorDisplay();
        //把显示器对象注入到主机中
        computer.setDisplay(display);
        //运行
        computer.run();

        //实例化一个黑白显示器
        GrayDisplay gray = new GrayDisplay();
        //给主机更换显示器
        computer.setDisplay(gray);
        //运行
        computer.run();
    }
}

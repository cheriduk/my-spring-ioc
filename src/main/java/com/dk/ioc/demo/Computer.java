package com.dk.ioc.demo;

/**
 * @title: Computer
 * @projectName my-spring-ioc
 * @Description: 主机类
 * @Author Cheri
 * @Date: 2019/4/30 23:34
 */

public class Computer {

   /* 依赖了 具体的实现 */
    private GrayDisplay display = new GrayDisplay();

    public void run(){
        System.out.println("======电脑启动=======");
        display.show();//点亮显示器 显示画面
        System.out.println("======电脑工作中...=========");
    }
}

package com.dk.ioc.demo2;

/**
 * @title: GrayDisplay
 * @projectName my-spring-ioc
 * @Description: 黑白显示器
 * @Author Cheri
 * @Date: 2019/4/30 23:56
 */
public class GrayDisplay implements IDisplay {
    private int width = 1024;
    private int height = 786;
    /**
     * 显示画面
     */
    public void show(){
        System.out.println(width+"====显示器工作：显示黑白画面===="+height);
    }
}

package com.dk.ioc.demo2;

/**
 * @title: ColorDisplay
 * @projectName my-spring-ioc
 * @Description: 彩色显示器
 * @Author Cheri
 * @Date: 2019/4/30 23:58
 */
public class ColorDisplay implements IDisplay {
    private int width = 2048;
    private int height = 2000;
    /**
     * 显示画面
     */
    public void show(){
        System.out.println(width+"====显示器工作：显示彩色画面===="+height);
    }
}
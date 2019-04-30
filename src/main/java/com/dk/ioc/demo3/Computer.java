package com.dk.ioc.demo3;

/**
 * @title: Computer
 * @projectName my-spring-ioc
 * @Description: TODO
 * @Author Cheri
 * @Date: 2019/5/1 00:41
 */

public class Computer {
    //依赖接口
    private IUsb usb;

    public void run(){
        System.out.println("======电脑启动=======");
        if(usb == null){
            System.out.println("%%%%%%没有发现USB设备，请检查连接！%%%%%%");
        }else{
            //注入的usb对象使用接口。
            usb.useUSB();//
        }
        System.out.println("======电脑工作中...=========");
    }

    /**
     * 注入的方法
     */
    public void setUsb(IUsb usb) {
        this.usb = usb;
    }
}
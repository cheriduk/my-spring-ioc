package com.dk.ioc.demo3;

/**
 * @title: Camera
 * @projectName my-spring-ioc
 * @Description: TODO
 * @Author Cheri
 * @Date: 2019/5/1 00:16
 */
public class Camera implements IUsb{

    public void useUSB() {
        System.out.println("**********我是相机，我在使用USB传照片！**********");
    }
}

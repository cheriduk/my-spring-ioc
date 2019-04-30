package com.dk.ioc.demo3;

/**
 * @title: Phone
 * @projectName my-spring-ioc
 * @Description: TODO
 * @Author Cheri
 * @Date: 2019/5/1 00:16
 */
public class Phone implements IUsb{
    private String brand;

    @Override
    public void useUSB() {
        System.out.println("******我是"+brand+"手机，我在使用USB充电！*****");
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

}

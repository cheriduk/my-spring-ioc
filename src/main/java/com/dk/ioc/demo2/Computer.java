package com.dk.ioc.demo2;

/**
 * @title: Computer
 * @projectName my-spring-ioc
 * @Description: 主机类
 *  此类只依赖显示器的接口，在运行时，再决定依赖的被注入的对象，故名 依赖注入（DI）
 * @Author Cheri
 * @Date: 2019/4/30 23:59
 */

public class Computer {
    /*这里只依赖了接口，并没有赋值具体的实例对象*/
    private IDisplay display;


    public void run(){
        System.out.println("======电脑启动=======");
        if(display == null){
            System.out.println("%%%%%%没有发现显示器，请检查连接！%%%%%%");
        }else{
            //这里的显示器对象，是使用者注入的对象。
            display.show();//点亮显示器 显示画面
        }
        System.out.println("======电脑工作中...=========");
    }

    /**
     * 留一个显示器接口的插槽（注入对象的方式）
     */
    public void setDisplay(IDisplay display){
        this.display = display;
    }
}

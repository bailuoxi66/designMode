package com.example.designmode.AdapterDemo;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2022/1/17 9:05 下午
 * @description
 */

//客户端类： 电脑【超薄】   想上网，但是插不上网线
public class Computer {
    public void net(NetToUsb netToUsb){
        //上网的具体实现，找一个转接头【将头脑中想要实现的东西，转化成代码实现的东西，会非常爽】
        netToUsb.handleRequest();
    }

    public static void main(String[] args) {
         //需要电脑、网线、适配器
        Computer computer = new Computer(); //电脑
        Adaptee adaptee = new Adaptee();    //网线
        Adapter adapter = new Adapter(adaptee);    //适配器

        computer.net(adapter);
    }
}

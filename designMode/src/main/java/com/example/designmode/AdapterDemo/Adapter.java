package com.example.designmode.AdapterDemo;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2022/1/17 9:11 下午
 * @description
 */

//真正的适配器，需要连接usb，连接网线
public class Adapter implements NetToUsb{

    //因为适配器可以连接任何的网线
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void handleRequest() {
        adaptee.request();  //可以上网了
    }
}

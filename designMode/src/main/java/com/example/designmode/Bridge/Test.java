package com.example.designmode.Bridge;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2022/1/19 10:53 下午
 * @description
 */

public class Test {
    public static void main(String[] args) {
        //苹果笔记本
        Laptop laptop = new Laptop(new Apple());
        laptop.info();
    }
}

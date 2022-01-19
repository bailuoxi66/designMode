package com.example.designmode.Bridge;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2022/1/19 10:26 下午
 * @description
 */

//苹果品牌
public class Apple implements Brand{
    @Override
    public void info() {
        System.out.println("苹果");
    }
}

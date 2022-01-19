package com.example.designmode.Bridge;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2022/1/19 10:25 下午
 * @description
 */

//联想品牌
public class Lenovo implements Brand{
    @Override
    public void info() {
        System.out.println("联想");
    }
}

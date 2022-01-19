package com.example.designmode.Bridge;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2022/1/19 10:28 下午
 * @description
 */

//抽象的电脑类型类
public abstract class Computer {

    //品牌是电脑的一个属性，不应该继承，因为电脑出场肯定自带品牌
    //这里不能是private。否则只有Computer才可以使用
    protected Brand brand;

    public Computer(Brand brand){
        this.brand = brand;
    }

    public void info(){
        brand.info();
    }
}

class Desktop extends Computer{

    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("台式机");
    }
}

class Laptop extends Computer{

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("笔记本");
    }
}

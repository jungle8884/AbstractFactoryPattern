package com.AbstractFactoryPattern;

public class Main {

    /*
    以上最先写产品接口、工厂接口
        然后写苹果产品、富士康
        再写华为产品、华为工厂
        最后写主程序 */

    public static void main(String[] args) {
	// write your code here
        // 富士康工厂生产苹果设备
        IElectronicsFactory electronicsFactory = new FoxConn();
        electronicsFactory.CreatePhone();
        electronicsFactory.CreatePad();
        electronicsFactory.CreateComputer();

        // 华为工厂生产华为设备
        electronicsFactory = new HuaWeiFactory();
        electronicsFactory.CreatePhone();
        electronicsFactory.CreatePad();
        electronicsFactory.CreateComputer();
    }
}



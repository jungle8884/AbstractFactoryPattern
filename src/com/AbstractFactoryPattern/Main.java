package com.AbstractFactoryPattern;

public class Main {

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

package com.AbstractFactoryPattern;

// 生产苹果设备的工厂
public class FoxConn implements IElectronicsFactory {

    // 富士康可以生产苹果产品
    Apple apple = new Apple();

    @Override
    public void CreatePhone() {
        apple.getPhone();
    }

    @Override
    public void CreatePad() {
        apple.getPad();
    }

    @Override
    public void CreateComputer() {
        apple.getComputer();
    }
}

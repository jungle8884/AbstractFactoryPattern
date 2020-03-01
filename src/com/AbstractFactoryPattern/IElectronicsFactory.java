package com.AbstractFactoryPattern;

// 电子产品工厂
public interface IElectronicsFactory {
    // 生产手机产品
    void CreatePhone();
    // 生产平板电脑
    void CreatePad();
    // 生产电脑
    void CreateComputer();
}

package com.AbstractFactoryPattern;

// 华为工厂
public class HuaWeiFactory implements IElectronicsFactory {

    // 华为可以自己生产
    HuaWei hw = new HuaWei();

    @Override
    public void CreatePhone() {
        hw.getPhone();
    }

    @Override
    public void CreatePad() {
        hw.getPad();
    }

    @Override
    public void CreateComputer() {
        hw.getComputer();
    }
}

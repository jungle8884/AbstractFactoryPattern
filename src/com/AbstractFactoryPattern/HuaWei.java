package com.AbstractFactoryPattern;

public class HuaWei implements IPhone, IPad, IComputer {
    @Override
    public void getComputer() {
        System.out.println("Congratulations! You get an MateBook");
    }

    @Override
    public void getPad() {
        System.out.println("Congratulations! You get an MateBook");
    }

    @Override
    public void getPhone() {
        System.out.println("Congratulations! You get an MateX");
    }
}

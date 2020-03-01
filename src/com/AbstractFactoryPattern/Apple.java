package com.AbstractFactoryPattern;

public class  Apple implements IPhone, IPad, IComputer {
    @Override
    public void getPhone() {
        System.out.println("Congratulations! You get an iphoneX");
    }


    @Override
    public void getComputer() {
        System.out.println("Congratulations! You get an MacBook");
    }

    @Override
    public void getPad() {
        System.out.println("Congratulations! You get an iPad");
    }
}

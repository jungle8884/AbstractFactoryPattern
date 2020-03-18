package com.AbstractFactoryPattern;

class Mate implements IPhone {

    @Override
    public void Reading() {
        System.out.println("用Mate阅读.");
    }
}

class MatePad implements IPad {

    public void WatchingMovies() {
        System.out.println("用MateBook看电影.");
    }
}

class MateBook implements IComputer {

    public void Writing() {
        System.out.println("用MateBook写文档.");
    }
}

// 华为工厂
public class HuaWeiFactory implements IElectronicsFactory {

    public void CreatePhone() {
        IPhone mate = new Mate();
        mate.Reading();
    }

    public void CreatePad() {
        IPad matePad = new MatePad();
        matePad.WatchingMovies();
    }

    public void CreateComputer() {
        IComputer mateBook = new MateBook();
        mateBook.Writing();
    }
}

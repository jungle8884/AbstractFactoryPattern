package com.AbstractFactoryPattern;

class iPhone implements IPhone {

    public void Reading() {
        System.out.println("用iPhone阅读小说.");
    }
}

class iPad implements IPad {

    public void WatchingMovies() {
        System.out.println("用iPad看电影.");
    }
}

class MacBook implements IComputer {

    public void Writing() {
        System.out.println("用MacBook写文档.");
    }
}

// 生产苹果设备的工厂
public class FoxConn implements IElectronicsFactory {

    public void CreatePhone() {
        IPhone iPhone = new iPhone();
        iPhone.Reading();
    }

    public void CreatePad() {
        IPad iPad = new iPad();
        iPad.WatchingMovies();
    }

    public void CreateComputer() {
        IComputer macBook = new MacBook();
        macBook.Writing();
    }
}

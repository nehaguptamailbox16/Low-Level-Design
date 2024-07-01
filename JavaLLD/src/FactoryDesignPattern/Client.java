package FactoryDesignPattern;

import Factory.component.button.Button;

public class Client {
    public static void main(String[] args) {

        Platform p = new Platform();

        UIComponentFactory cf = p.createUIComponentFactory();
        Button button = cf.createButton();


    }
}
package FactoryDesignPattern;

import FactoryDesignPattern.component.button.Button;

public class Client {
    public static void main(String[] args) {


        // if we know platform directly
        Platform p = new Android();

        UIComponentFactory cf = p.createUIComponentFactory();
        Button button = cf.createButton();



        // if platform is coming as String
        String platform = "Android";
        Platform pp = Platform.createPlatform(platform);
        UIComponentFactory cff = pp.createUIComponentFactory();
        Button button1 = cff.createButton();

    }
}
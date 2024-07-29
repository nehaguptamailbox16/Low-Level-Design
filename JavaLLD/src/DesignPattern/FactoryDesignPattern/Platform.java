package DesignPattern.FactoryDesignPattern;

public abstract class Platform {
    public void setRefreshRate(){

    }

    public void setTheme(){


    }

    public abstract UIComponentFactory createUIComponentFactory();


    public static Platform createPlatform(String platformName){
        return PlatformFactory.getPlatform(platformName);
    }



}


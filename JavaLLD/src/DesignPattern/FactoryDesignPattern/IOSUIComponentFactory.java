package DesignPattern.FactoryDesignPattern;


import DesignPattern.FactoryDesignPattern.component.button.IOSButton;
import DesignPattern.FactoryDesignPattern.component.dropdown.IOSDropDown;
import DesignPattern.FactoryDesignPattern.component.button.Button;
import DesignPattern.FactoryDesignPattern.component.dropdown.DropDown;

public class IOSUIComponentFactory implements UIComponentFactory{

    @Override
    public Button createButton(){
        return new IOSButton();
    }

    @Override
    public DropDown createDropdown(){
        return new IOSDropDown();
    }
}
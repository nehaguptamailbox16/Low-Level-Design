package FactoryDesignPattern;


import FactoryDesignPattern.component.button.IOSButton;
import FactoryDesignPattern.component.dropdown.IOSDropDown;
import FactoryDesignPattern.component.button.Button;
import FactoryDesignPattern.component.dropdown.DropDown;

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
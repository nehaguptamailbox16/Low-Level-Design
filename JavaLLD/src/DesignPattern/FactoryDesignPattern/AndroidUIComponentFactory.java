package DesignPattern.FactoryDesignPattern;


import DesignPattern.FactoryDesignPattern.component.button.AndroidButton;
import DesignPattern.FactoryDesignPattern.component.dropdown.AndroidDropDown;
import DesignPattern.FactoryDesignPattern.component.button.Button;
import DesignPattern.FactoryDesignPattern.component.dropdown.DropDown;

public class AndroidUIComponentFactory implements UIComponentFactory{

    @Override
    public Button createButton(){
        return new AndroidButton();
    }

    @Override
    public DropDown createDropdown(){

        return new AndroidDropDown();
    }
}
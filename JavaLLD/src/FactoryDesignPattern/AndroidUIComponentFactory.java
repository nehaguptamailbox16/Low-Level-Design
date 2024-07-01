package FactoryDesignPattern;


import FactoryDesignPattern.component.button.AndroidButton;
import FactoryDesignPattern.component.dropdown.AndroidDropDown;
import FactoryDesignPattern.component.button.Button;
import FactoryDesignPattern.component.dropdown.DropDown;

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
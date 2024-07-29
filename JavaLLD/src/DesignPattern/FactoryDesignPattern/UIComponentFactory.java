package DesignPattern.FactoryDesignPattern;

import DesignPattern.FactoryDesignPattern.component.dropdown.DropDown;
import DesignPattern.FactoryDesignPattern.component.button.Button;


public interface UIComponentFactory {
    Button createButton();
    DropDown createDropdown();
}
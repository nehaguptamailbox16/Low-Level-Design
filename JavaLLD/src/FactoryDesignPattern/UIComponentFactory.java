package FactoryDesignPattern;

import FactoryDesignPattern.component.dropdown.DropDown;
import FactoryDesignPattern.component.button.Button;


public interface UIComponentFactory {
    Button createButton();
    Dropdown createDropdown();
}
package org.mxhc.factories;

import org.mxhc.products.Button;
import org.mxhc.products.Checkbox;
import org.mxhc.products.WindowsButton;
import org.mxhc.products.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {
    
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
    
    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

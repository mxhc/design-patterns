package org.mxhc.factories;

import org.mxhc.products.Button;
import org.mxhc.products.Checkbox;
import org.mxhc.products.MacOSButton;
import org.mxhc.products.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {
    
    @Override
    public Button createButton() {
        return new MacOSButton();
    }
    
    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

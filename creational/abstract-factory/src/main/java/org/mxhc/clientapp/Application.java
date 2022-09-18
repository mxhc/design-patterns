package org.mxhc.clientapp;

import org.mxhc.factories.GUIFactory;
import org.mxhc.products.Button;
import org.mxhc.products.Checkbox;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;
    
    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }
    
    public void paint() {
        button.paint();
        checkbox.paint();
    }
}

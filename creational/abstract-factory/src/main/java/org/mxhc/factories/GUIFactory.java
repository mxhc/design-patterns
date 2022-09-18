package org.mxhc.factories;

import org.mxhc.products.Button;
import org.mxhc.products.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

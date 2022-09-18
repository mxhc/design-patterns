package org.mxhc.factory;

import org.mxhc.product.Button;
import org.mxhc.product.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {
    
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

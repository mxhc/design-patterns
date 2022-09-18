package org.mxhc.factory;

import org.mxhc.product.Button;
import org.mxhc.product.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {
    
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}

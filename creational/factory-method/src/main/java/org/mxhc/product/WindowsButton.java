package org.mxhc.product;

/**
 * Windows button implementation.
 */
public class WindowsButton implements Button {
    
    @Override
    public void render() {
        System.out.println("Win Test Button");
        onClick();
    }
    
    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello Windows World!'");
    }
    
}

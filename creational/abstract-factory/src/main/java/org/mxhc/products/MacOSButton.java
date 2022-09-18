package org.mxhc.products;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a macOS variant of a button.
 */
public class MacOSButton implements Button {
    
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}

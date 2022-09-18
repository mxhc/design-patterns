package org.mxhc;

import org.mxhc.factory.Dialog;
import org.mxhc.factory.HtmlDialog;
import org.mxhc.factory.WindowsDialog;

/**
 * Demo class. Everything comes together here.
 * <a href="https://refactoring.guru/design-patterns/factory-method">...</a>
 */
public class Main {
    
    private static Dialog dialog;
    
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }
    
    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }
    
    /**
     * All the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
    
}
package org.mxhc;

import org.mxhc.clientapp.Application;
import org.mxhc.factories.GUIFactory;
import org.mxhc.factories.MacOSFactory;
import org.mxhc.factories.WindowsFactory;

/**
 * Demo class. Everything comes together here.
 * <a href="https://refactoring.guru/design-patterns/abstract-factory">...</a>
 */
public class Demo {
    
    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }
    
    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
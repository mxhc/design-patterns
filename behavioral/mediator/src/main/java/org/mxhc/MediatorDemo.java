package org.mxhc;


import org.mxhc.components.AddButton;
import org.mxhc.components.DeleteButton;
import org.mxhc.components.Filter;
import org.mxhc.components.List;
import org.mxhc.components.SaveButton;
import org.mxhc.components.TextBox;
import org.mxhc.components.Title;
import org.mxhc.mediator.Editor;
import org.mxhc.mediator.Mediator;

import javax.swing.*;

/**
 * Demo class. Everything comes together here.
 */
public class MediatorDemo {
    public static void main(String[] args) {
        Mediator mediator = new Editor();
        
        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());
        
        mediator.createGUI();
    }
}
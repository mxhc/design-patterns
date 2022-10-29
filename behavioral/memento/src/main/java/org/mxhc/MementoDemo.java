package org.mxhc;


import org.mxhc.editor.Editor;
import org.mxhc.shapes.Circle;
import org.mxhc.shapes.CompoundShape;
import org.mxhc.shapes.Dot;
import org.mxhc.shapes.Rectangle;

import java.awt.*;

public class MementoDemo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),
                
                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),
                
                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
package org.mxhc;

import org.mxhc.shapes.Circle;
import org.mxhc.shapes.CompoundShape;
import org.mxhc.shapes.Dot;
import org.mxhc.shapes.Rectangle;
import org.mxhc.shapes.Shape;
import org.mxhc.visitor.XMLExportVisitor;

public class VisitorDemo {
    
    public static void main(String[] args) {
        Dot dot = new Dot(1, 10, 55);
        Circle circle = new Circle(2, 23, 15, 10);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);
        
        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);
        
        CompoundShape c = new CompoundShape(5);
        c.add(dot);
        compoundShape.add(c);
        
        export(circle, compoundShape);
    }
    
    private static void export(Shape... shapes) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.export(shapes));
    }
    
}

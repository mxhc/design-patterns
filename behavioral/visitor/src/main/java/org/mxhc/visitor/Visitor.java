package org.mxhc.visitor;

import org.mxhc.shapes.Circle;
import org.mxhc.shapes.CompoundShape;
import org.mxhc.shapes.Dot;
import org.mxhc.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);
    
    String visitCircle(Circle circle);
    
    String visitRectangle(Rectangle rectangle);
    
    String visitCompoundGraphic(CompoundShape cg);
}
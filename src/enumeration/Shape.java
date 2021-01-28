package enumeration;

public enum Shape {
    CIRCLE, QUAD, TRAPEZOID,OVAL,TRIANGLE;
}

class ShapeFormatter{
    public String getShapeName(Shape shape){
        switch(shape){
            case CIRCLE: return "Circle";
            case QUAD: return "Quad";
            case TRAPEZOID: return "Trapeziod";
            case OVAL: return "Oval";
            case TRIANGLE: return "Triangle";
            default: return "Unknown shape";
        }
    }
    public void printShape(Shape shape){
        System.out.println("Shape name is " + getShapeName(shape));
    }
}

class ShapeTester{
    public static void main(String[] args) {
        ShapeFormatter shapeFormatter = new ShapeFormatter();
        Shape[] shapes = new Shape[5];
        shapes[0] = Shape.OVAL;
        shapes[1] = Shape.QUAD;
        shapes[2] = Shape.TRAPEZOID;
        shapes[3] = Shape.TRIANGLE;
        shapes[4] = Shape.CIRCLE;
        for (Shape shape : shapes) {
            shapeFormatter.printShape(shape);
        }


    }
}

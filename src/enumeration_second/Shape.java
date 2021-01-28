package enumeration_second;


public enum Shape {

    CIRCLE("Circle"), QUAD("Quad"), TRAPEZOID("Trapezoid"),OVAL("Oval"),TRIANGLE("Triangle");
    private String shapeName;

    private Shape(String name){
        this.shapeName = name;
    }

    public String getShapeName(){
        return shapeName;
    }
}

class ShapeTester{
    public static void main(String[] args) {

        Shape[] shapes = new Shape[5];
        shapes[0] = Shape.OVAL;
        shapes[1] = Shape.QUAD;
        shapes[2] = Shape.TRAPEZOID;
        shapes[3] = Shape.TRIANGLE;
        shapes[4] = Shape.CIRCLE;
        for (Shape shape : shapes) {
            System.out.println("Shape name is " + shape.getShapeName());
        }


    }
}



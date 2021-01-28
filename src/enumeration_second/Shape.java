package enumeration_second;


import java.util.EnumSet;

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
        EnumSet<Shape> shapes = EnumSet.allOf(Shape.class);

        for (Shape shape : shapes) {
            System.out.println("Shape name is " + shape.getShapeName());
        }


    }
}



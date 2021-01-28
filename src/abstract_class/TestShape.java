package abstract_class;

public class TestShape {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape oval = new Oval();
        Shape triangle = new Triangle();
        Shape trapezoid = new Trapezoid();

        Shape[] shapes = new Shape[5];
        shapes[0] = circle;
        shapes[1] = quad;
        shapes[2] = oval;
        shapes[3] = triangle;
        shapes[4] = trapezoid;

        for (Shape shape : shapes ) {
            shape.printShapeName();
        }

    }
}

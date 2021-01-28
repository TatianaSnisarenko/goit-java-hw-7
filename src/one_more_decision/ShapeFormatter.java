package one_more_decision;

public class ShapeFormatter implements Printable{
    private Shape shape;

    public ShapeFormatter(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void printName() {
        System.out.println("Shape name is " + shape.getName());
    }
}

class ShapeFormatterTester{
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Quad();
        shapes[1] = new Oval();
        shapes[2] = new Circle();
        shapes[3] = new Trapezoid();
        shapes[4] = new Triangle();
        for (Shape shape : shapes) {
            new ShapeFormatter(shape).printName();
        }

    }
}

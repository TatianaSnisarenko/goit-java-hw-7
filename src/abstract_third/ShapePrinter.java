package abstract_third;

public class ShapePrinter implements Printable{
    private Shape shape;

    public ShapePrinter(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void printName() {
        shape.printName();
    }
}

class ShapePrinterTest{
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle();
        shapes[1] = new Quad();
        shapes[2] = new Oval();
        shapes[3] = new Trapezoid();
        shapes[4] = new Triangle();
        for (Shape shape : shapes) {
            new ShapePrinter(shape).printName();
        }
    }
}

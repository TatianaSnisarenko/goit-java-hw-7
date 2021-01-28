package enumiration_thrid;

import java.util.EnumSet;

public enum Shape {
    QUAD{
        @Override
        void printShapeName() {
            System.out.println("Shape name is Quad");
        }
    },

    CIRCLE{
        @Override
        void printShapeName() {
            System.out.println("Shape name is Circle");
        }
    },
    OVAL{
        @Override
        void printShapeName() {
            System.out.println("Shape name is Oval");
        }
    },
    TRIANGLE{
        @Override
        void printShapeName() {
            System.out.println("Shape name is Triangle");
        }
    },
    TRAPEZOID{
        @Override
        void printShapeName() {
            System.out.println("Shape name is Trapezoid");
        }
    };

    abstract void printShapeName();
}

class ShapeTester{
    public static void main(String[] args) {
        EnumSet<Shape> shapes = EnumSet.allOf(Shape.class);
        for (Shape shape : shapes) {
            shape.printShapeName();
        }
    }
}

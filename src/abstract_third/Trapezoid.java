package abstract_third;

public class Trapezoid extends Shape{
    private String name;

    public Trapezoid() {
        this.name = "Trapezoid";
    }

    @Override
    public String getName() {
        return name;
    }
}

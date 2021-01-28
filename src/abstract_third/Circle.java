package abstract_third;

public class Circle extends Shape{
    private String name;

    public Circle() {
        this.name = "Circle";
    }

    @Override
    public String getName() {
        return name;
    }
}

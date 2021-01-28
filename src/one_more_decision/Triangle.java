package one_more_decision;

public class Triangle extends Shape{
    private String name;

    public Triangle() {
        this.name = "Triangle";
    }


    @Override
    public String getName() {
        return name;
    }
}

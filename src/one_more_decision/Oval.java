package one_more_decision;

public class Oval extends Shape{
    private String name;

    public Oval() {
        this.name = "Oval";
    }

    @Override
    public String getName() {
        return name;
    }
}

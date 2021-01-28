package abstract_third;

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

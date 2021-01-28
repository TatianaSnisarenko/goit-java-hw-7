package abstract_third;

public class Quad extends Shape{
    private String name;

    public Quad() {
        this.name = "Quad";
    }

    @Override
    public String getName() {
        return name;
    }
}

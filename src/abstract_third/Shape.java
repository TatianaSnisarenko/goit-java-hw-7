package abstract_third;

public abstract class Shape implements Printable{
    @Override
    public void printName() {
        System.out.println("Shape name is " + getName());
    }

    public abstract String getName();
}

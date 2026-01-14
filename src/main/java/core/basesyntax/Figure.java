package core.basesyntax;

public abstract class Figure implements Shape {
    private Colors color;

    public abstract String getName();

    public void print() {
        System.out.println("Figure:" + getName() + "area:" + getArea() + "color:" + color.name());
    }

    public void setColor(Colors color) {
        this.color = color;
    }
}

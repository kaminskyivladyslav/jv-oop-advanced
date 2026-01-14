package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, Colors color) {
        this.radius = radius;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getName() {
        return "circle";
    }

    @Override
    public void print() {
        super.print();
        System.out.println("radius: " + radius);
    }
}

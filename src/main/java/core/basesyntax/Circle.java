package core.basesyntax;

public class Circle extends Figure {
    private double radius;

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
}

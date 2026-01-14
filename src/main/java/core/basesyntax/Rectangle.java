package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide, Colors color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public String getName() {
        return "rectangle";
    }
}

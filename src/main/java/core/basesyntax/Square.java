package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, Colors color) {
        this.side = side;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getName() {
        return "square";
    }
}

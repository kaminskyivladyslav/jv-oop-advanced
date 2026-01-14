package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double side;
    private double side2;
    private double side3;

    public IsoscelesTrapezoid(double side, double side2, double side3, Colors color) {
        this.side = side;
        this.side2 = side2;
        this.side3 = side3;
        setColor(color);
    }

    @Override
    public double getArea() {
        return ((side + side2) * side3) / 2;
    }

    @Override
    public void print() {
        System.out.println(
                "Figure: circle, "
                        + "area: " + getArea() + " sq. units, "
                        + "side: " + side + " units, "
                        + "side2: " + side2 + " units, "
                        + "side3: " + side3 + " units, "
                        + "color: " + getColor().name());
    }
}

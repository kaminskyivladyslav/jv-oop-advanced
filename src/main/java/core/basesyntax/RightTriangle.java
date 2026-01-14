package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, Colors color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public String getName() {
        return "right triangle";
    }

    @Override
    public void print() {
        super.print();
        System.out.println("firstLeg: " + firstLeg + ", secondLeg: " + secondLeg);
    }
}

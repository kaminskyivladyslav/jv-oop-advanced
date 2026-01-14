package core.basesyntax;

public class Square extends Figure {
    private final double squareSide;

    public Square(double squareSide, Colors color) {
        this.squareSide = squareSide;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return squareSide * squareSide;
    }

    @Override
    public String getName() {
        return "square";
    }

    @Override
    public void print() {
        super.print();
        System.out.println("squareSide" + squareSide);
    }
}

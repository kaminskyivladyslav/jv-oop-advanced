package core.basesyntax;

public abstract class Figure implements FiguresWillDo {
    private Colors color;

    public abstract String getName();

    public void print() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + ", color: " + color);
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Colors.WHITE);
    }

    public void setColor(Colors color) {
        this.color = color;
    }
}

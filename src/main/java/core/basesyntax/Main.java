package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Colors color = Colors.values()[random.nextInt(Colors.values().length)];

        Figure[] figures = new Figure[] {
                new Circle(5, color),
                new IsoscelesTrapezoid(12,15,20, color),
                new Square(4, color),
                FigureSupplier.getRandomFigure(),
                FigureSupplier.getRandomFigure(),
                FigureSupplier.getRandomFigure() };
        for (int i = 0; i < figures.length; i++) {
            figures[i].print();
        }

    }

}


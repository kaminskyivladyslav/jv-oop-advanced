package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Colors color = Colors.values()[random.nextInt(Colors.values().length)];
        Figure[] figures = new Figure[5];
        for (int i = 0; i < figures.length; i++) {
            FigureSupplier supplier = new FigureSupplier();
            Figure figure = supplier.getRandomFigure();
            Figure defaultFigure = supplier.getRandomFigure();
            if (i < figures.length / 2) {
                figures[i] = figure;
            }
            figures[i] = defaultFigure;
        }
        for (Figure figure : figures) {
            figure.print();
        }
    }
}


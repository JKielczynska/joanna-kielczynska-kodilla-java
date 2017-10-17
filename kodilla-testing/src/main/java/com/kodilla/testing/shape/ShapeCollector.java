package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if(figures.contains(shape)) {
            figures.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        return figures.get(n);

    }

    public String showFigures() {
        StringBuilder figuresToPrint = new StringBuilder();
        for (Shape shape : figures) {
            figuresToPrint.append(shape);
        }
        return figuresToPrint.toString();
    }

    public int collectionSize() {
        return figures.size();
    }

}

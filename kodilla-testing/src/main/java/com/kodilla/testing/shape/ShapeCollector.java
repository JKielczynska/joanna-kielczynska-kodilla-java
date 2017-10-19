package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

/**
 * Class stores geometric figures in the ArrayList collection
 * and performs the operations of adding, removing, retrieving and showing on figures.
 */
public class ShapeCollector {
    List<Shape> figures = new ArrayList<>();

    /**Adds figure to ArrayList collection.*/
    public void addFigure(final Shape shape) {
        figures.add(shape);
    }

    /**Removes figure from ArrayList collection.*/
    public boolean removeFigure(final Shape shape) {
        boolean result = false;
        if (figures.contains(shape)) {
            figures.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(final int n) {
        return figures.get(n);
    }

    /**Print figures.*/
    public String showFigures() {
        StringBuilder figuresToPrint = new StringBuilder();
        for (Shape shape : figures) {
            figuresToPrint.append(shape);
        }
        return figuresToPrint.toString();
    }

    /**Returns size of figure collection.*/
    public int collectionSize() {
        return figures.size();
    }
}
package com.kodilla.stream.beautifier;

/**Class has method which parameters will be able to beautify text with lambda expression.*/
public class PoemBeautifier {
    public void beautify(final String text, final PoemDecorator poemDecorator) {
        System.out.println(poemDecorator.decorateText(text));
    }
}

package com.kodilla.stream.beautifier;

/** Class changes text with use lambda expressions.*/

public class PoemMain {

    /**Method changes text with use lambda expressions..*/
    public static void main(final String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("poem text", text -> text.toUpperCase());
        poemBeautifier.beautify("poem text", text -> "^^^" + text + "^^^");
        poemBeautifier.beautify("poem text", text -> new StringBuilder(text).reverse().toString());
    }
}

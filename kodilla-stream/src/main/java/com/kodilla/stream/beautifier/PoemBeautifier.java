package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    // metoda beautify posaidającą metodę beautify, której
    // jako parametry będzie można przekazać tekst do upiększenia
    // oraz wyrażenie lambda upiększające tekst.

    public void beautify(String text, PoemDecorator poemBeautifier) {
        String result = poemBeautifier.decorate(text);
        System.out.println(result);
    }
}

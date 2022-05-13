package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.Locale;

public class StreamMain {

    public static void main(String[] args) {

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(25);


        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Lambda", text -> "ABC " + text + " ABC");
        poemBeautifier.beautify("Duża Lambda", text -> text.toUpperCase());
        poemBeautifier.beautify("mała Lambda", text -> text.toLowerCase());
        poemBeautifier.beautify("niebieska Lambda", text -> "\u001B[34m" + text + "\u001B[0m");
        poemBeautifier.beautify("podkreślona Lambda", text -> "\033[4;30m" + text + "\033[4;0m");


        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(5,6, (a, b) -> a+b);
        expressionExecutor.executeExpression(12, 7, (a, b) -> a-b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(6, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(6, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(6,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(6, 4, FunctionalCalculator::divideAByB);

    }
}

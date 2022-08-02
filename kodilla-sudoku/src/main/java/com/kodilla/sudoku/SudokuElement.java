package com.kodilla.sudoku;

public class SudokuElement {

    //Pojedyncza komórka planszy Sudoku będzie reprezentowana przez pojedynczy obiekt klasy
    // SudokuElement, który będzie zawierał pole value typu int.
    //
    //Wartość -1 w tym polu będzie oznaczała brak wartości (puste pole) – zdefiniuj w tym
    // celu stałą public static int EMPTY = -1;.
    //
    //Klasa SudokuElement będzie również zawierała kolekcję możliwych wartości (z której
    //będą eliminowane wartości wykluczone w trakcie rozwiązywania Sudoku),


    private int value;
    public static int EMPTY = -1;

    public SudokuElement(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}


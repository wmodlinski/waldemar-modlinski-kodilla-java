package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    //Zbiór komórek będzie stanowił wiersz planszy (klasa SudokuRow) – będzie to
    // kolekcja ArrayList obiektów SudokuElement,
    //
    //Zbiór wierszy SudokuRow będzie stanowił planszę (klasa SudokuBoard) – będzie to
    // kolekcja ArrayList obiektów SudokuRow

    public List<SudokuElement> sudokuElements = new ArrayList<>();

    public SudokuRow(List<SudokuElement> sudokuElements) {
        this.sudokuElements = sudokuElements;
    }

    public List<SudokuElement> getSudokuElements() {
        return sudokuElements;
    }

    @Override
    public String toString() {
        return "SudokuRow{" +
                "sudokuElements=" + sudokuElements +
                '}';
    }
}

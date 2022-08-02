package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    //Odczytywanie danych pobieranych od użytkownika zrealizuj przy pomocy klasy bibliotecznej
    // Scanner. Wyświetlanie planszy zrealizuj przy pomocy znaków | (pipe) oraz - (myślnik)
    // dla ramek (jako metodę toString() klasy SudokuBoard).

    public List<SudokuRow> sudokuRow = new ArrayList<>();

    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i < 10; i++){

            for(int j = 0; j < 10; j++) {
                if(i==0 && j==0) {
                    result += " " + "   ";
                }
                else if(i==0) {
                    result += "_" + "   ";
                }
                else if(j==0) {
                    result += " " + " | ";
                }
                else result += "_" + " | ";
            }
            result += "\n";
        }
        return result;
    }
}

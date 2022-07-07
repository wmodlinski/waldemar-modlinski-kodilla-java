package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {

        //Given
        Library borrowedBooksToday = new Library("Wypożyczone książki dzisiaj: ");

        Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", LocalDate.of(2000, 10, 5));
        Book book2 = new Book("Książka Kolejna", "Randomowy Janek", LocalDate.of(2020, 5, 22));
        Book book3 = new Book("Dzisiejsza książka", "Codzienny Marek", LocalDate.now());

        borrowedBooksToday.getBooks().add(book1);
        borrowedBooksToday.getBooks().add(book2);
        borrowedBooksToday.getBooks().add(book3);

        //Płytkie klonowanie
        Library borrowedBooksYesterday = null;
        try {
            borrowedBooksYesterday = borrowedBooksToday.shallowCopy();
            borrowedBooksYesterday.setName("Wypożyczone książki wczoraj: ");
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Głębokie klonowanie
        Library borrowedBooksYearAgo = null;
        try {
            borrowedBooksYearAgo = borrowedBooksToday.deepCopy();
            borrowedBooksYearAgo.setName("Wypożyczone książki rok temu: ");
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }

        System.out.println(borrowedBooksToday);
        System.out.println(borrowedBooksYesterday);
        System.out.println(borrowedBooksYearAgo);

        //When

        borrowedBooksToday.getBooks().remove(book2);

        //Then

        Assert.assertEquals(2, borrowedBooksToday.getBooks().size());
        Assert.assertEquals(2, borrowedBooksYesterday.getBooks().size());
        Assert.assertEquals(3, borrowedBooksYearAgo.getBooks().size());
        Assert.assertEquals(borrowedBooksYesterday.getBooks(), borrowedBooksToday.getBooks());
        Assert.assertNotEquals(borrowedBooksYearAgo.getBooks(), borrowedBooksToday.getBooks());
    }
}
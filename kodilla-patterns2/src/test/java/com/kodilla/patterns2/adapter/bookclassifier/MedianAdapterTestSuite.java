package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("Author1", "Title1", 2022, "Signature1");
        Book book2 = new Book("Author2", "Title2", 1945, "Signature2");
        Book book3 = new Book("Author3", "Title3", 1936, "Signature3");
        Book book4 = new Book("Author4", "Title4", 1918, "Signature4");
        Book book5 = new Book("Author5", "Title5", 1914, "Signature5");
        Book book6 = new Book("Author6", "Title6", 1514, "Signature6");
        Book book7 = new Book("Author7", "Title7", 2009, "Signature7");
        Book book8 = new Book("Author8", "Title8", -776, "Signature8");
        Book book9 = new Book("Author9", "Title9", 1986, "Signature9");
        Book book10 = new Book("Author10", "Title10", 1911, "Signature10");
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        bookSet.add(book6);
        bookSet.add(book7);
        bookSet.add(book8);
        bookSet.add(book9);
        bookSet.add(book10);
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(1936, median);
    }
}
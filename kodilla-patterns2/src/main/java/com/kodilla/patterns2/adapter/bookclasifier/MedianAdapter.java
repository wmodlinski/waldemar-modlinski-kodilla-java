package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        List<Book> bookAList = new ArrayList<>(bookSet);
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> booksMap = new HashMap<>();
        for(int i=0; i<bookSet.size(); i++){
            booksMap.put(new BookSignature(bookAList.get(i).getSignature()),
                    new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(
                            bookAList.get(i).getAuthor(),
                            bookAList.get(i).getTitle(),
                            bookAList.get(i).getPublicationYear()
                    ));
        }
        return medianPublicationYear(booksMap);
    }
}
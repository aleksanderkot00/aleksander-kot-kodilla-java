package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("Author 1", "Title 1", 1992, "23134");
        Book book2 = new Book("Author 2", "Title 2", 2006, "53522");
        Book book3 = new Book("Author 3", "Title 3", 2003, "82422");
        Book book4 = new Book("Author 4", "Title 4", 2015, "645423");
        Book book5 = new Book("Author 5", "Title 5", 2014, "34535");
        Book book6 = new Book("Author 6", "Title 6", 2011, "912313");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        bookSet.add(book6);

        MedianAdapter adapter = new MedianAdapter();

        //When
        int median = adapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(2008, median);
    }
}
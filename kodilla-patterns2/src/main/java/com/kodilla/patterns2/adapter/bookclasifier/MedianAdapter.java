package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter implements Classifier {
    public MedianAdaptee medianAdaptee = new MedianAdaptee();
    @Override
    public int publicationYearMedian(Set<BookA> bookASet) {
        if (bookASet.size() == 0) return 0;
        Map<BookSignature, BookB> bookMap = new HashMap<>();
        for (BookA bookA : bookASet) {
            bookMap.put(new BookSignature(bookA.getSignature()), new BookB(bookA.getAuthor(), bookA.getTitle(), bookA.getPublicationYear()));
        }
        return medianAdaptee.medianPublicationYear(bookMap);
    }
}

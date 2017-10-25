package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    /**Method adds forum users to list.*/
    public Forum() {
        theUserList.add(new ForumUser(001, "jkowalski", 'M', LocalDate.of(1989, 11, 03), 5));
        theUserList.add(new ForumUser(002, "anowak", 'F', LocalDate.of(1980, 05, 30), 56));
        theUserList.add(new ForumUser(003, "tkwiatkowska", 'F', LocalDate.of(2000, 12, 25), 0));
        theUserList.add(new ForumUser(004, "pcioczek", 'M', LocalDate.of(1995, 01, 11), 85));
        theUserList.add(new ForumUser(005, "aszewczyk", 'M', LocalDate.of(1991, 04, 14), 12));
        theUserList.add(new ForumUser(006, "anejman", 'M', LocalDate.of(1993, 07, 27), 0));
        theUserList.add(new ForumUser(007, "zszajdiuk", 'M', LocalDate.of(1987, 05, 05), 33));
    }

    public List<ForumUser> getUserList() {
        return theUserList;
    }

}

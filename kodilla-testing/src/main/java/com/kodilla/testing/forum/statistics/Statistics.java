package com.kodilla.testing.forum.statistics;

import java.util.List;

/** Interface uses to download the data presenting discussion forum statistics.*/
public interface Statistics {
    List<String> usersNames(); // list of users names
    int postsCount();          // total quantity of forum posts
    int commentsCount();       // total quantity of forum comments
}

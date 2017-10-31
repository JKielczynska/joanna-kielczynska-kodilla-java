package com.kodilla.exception.index;

import java.util.ArrayList;
import java.util.List;

public final class VideoCollector {
    /**Method returns film collection in ArrayList.*/
    public List<String>  getCollection() {
        ArrayList<String> videos = new ArrayList<>();
        videos.add("Extra movie");
        return videos;
    }
}

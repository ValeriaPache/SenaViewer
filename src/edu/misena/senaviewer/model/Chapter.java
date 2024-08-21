package edu.misena.senaviewer.model;

import java.util.Date;

public class Chapter {
    private int id;
    private String title;
    private int duration;
    private int year;
    private boolean viewed;
    private int timeViewed;
    private int sessionNumber;

    public Chapter(String title, int duration, int year) {
        this.title = title;
        this.duration = duration;
        this.year = year;
        this.viewed = false;
        this.timeViewed = 0;
    }
}

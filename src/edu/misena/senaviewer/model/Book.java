package edu.misena.senaviewer.model;

import java.util.Date;

public class Book {
    private int id;
    private String title;
    private Date edititionDate;
    private String editorial;
    private String authors;
    private String isbn;
    private boolean readed;
    private int timeReaded;

    public Book(String title, Date edititionDate, String editorial, String isbn) {
        this.title = title;
        this.edititionDate = edititionDate;
        this.editorial = editorial;
        this.isbn =isbn;
        this.readed = false;
        this.timeReaded = 0;
    }
}

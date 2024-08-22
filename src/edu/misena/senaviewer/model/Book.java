package edu.misena.senaviewer.model;
import java.time.LocalDate;

public class Book {
    private int id;
    private String title;
    private String edititionDate;
    private String editorial;
    private String authors;
    private String isbn;
    private boolean readed;
    private int timeReaded;
    private LocalDate lastReadDate; // Fecha de última lectura

    public Book(String title, String edititionDate, String editorial, String isbn) {
        this.title = title;
        this.edititionDate = edititionDate;
        this.editorial = editorial;
        this.isbn =isbn;
        this.readed = false;
        this.timeReaded = 0;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEditionDate() {
        return edititionDate;
    }

    public void setEditionDate(String editionDate) {
        this.edititionDate = editionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isReaded() {
        return readed;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public int getTimeReaded() {
        return timeReaded;
    }

    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }

    public LocalDate getLastReadDate() {
        return lastReadDate;
    }

    public void setLastReadDate(LocalDate lastReadDate) {
        this.lastReadDate = lastReadDate;
    }
}

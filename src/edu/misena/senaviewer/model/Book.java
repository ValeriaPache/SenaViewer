package edu.misena.senaviewer.model;

public class Book extends Publication{
    private int id;
    //private String title;
    //private String edititionDate;
    //private String editorial;
    private String authors;
    private String isbn;
    private boolean readed;
    private int timeReaded;

    public Book(String title, String edititionDate, String editorial, String isbn) {
        super( title, edititionDate, editorial);
        this.isbn =isbn;
        this.readed = false;
        this.timeReaded = 0;
    }

    /*public Book(String title, String edititionDate, String editorial, String isbn) {
        this.title = title;
        this.edititionDate = edititionDate;
        this.editorial = editorial;
        this.isbn =isbn;
        this.readed = false;
        this.timeReaded = 0;
    }*/

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /*public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }*/

    /*public String getEdititionDate() {
        return edititionDate;
    }

    public void setEdititionDate(String edititionDate) {
        this.edititionDate = edititionDate;
    }*/

    /*public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }*/

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

    @Override
    public String toString(){
        return super.toString() + ", Isbn: " + isbn + ", Readed: " + readed + ", TimeReaded: " + timeReaded ;
    }
}

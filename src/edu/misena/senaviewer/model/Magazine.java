package edu.misena.senaviewer.model;

import java.time.LocalDate;

public class Magazine {
        private int id;
        private String title;
        private String editionDate;
        private String editorial;
        private String authors;
        private LocalDate lastReadDate; // Fecha de última lectura

        public Magazine(String title, String editionDate, String editorial) {
                this.title = title;
                this.editionDate = editionDate;
                this.editorial = editorial;
                this.lastReadDate = null;
        }

        public int getId() {
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
                return editionDate;
        }

        public void setEditionDate(String editionDate) {
                this.editionDate = editionDate;
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

        public LocalDate getLastReadDate() {
                return lastReadDate;
        }

        public void setLastReadDate(LocalDate lastReadDate) {
                this.lastReadDate = lastReadDate;
        }
}

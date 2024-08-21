package edu.misena.senaviewer.model;

public class Movie {
        private int id;
        private String title;
        private String genre;
        private String creator;
        private int duration;
        private int year;
        private boolean viewed;
        private int timeViewed;

        public Movie(String title, String genre, String creator, int duration, int year) {
                this.title = title;
                this.genre = genre;
                this.creator = creator;
                this.duration = duration;
                this.year = year;
                this.viewed = false;
                this.timeViewed = 0;
        }
}

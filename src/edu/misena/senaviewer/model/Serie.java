package edu.misena.senaviewer.model;

public class Serie {
        private int id;
        private String title;
        private String genre;
        private String creator;
        private int duration;
        private int year;
        private boolean viewed;
        private int timeViewed;
        private int sessionQuantity;

        public Serie(String title, String genre, int duration) {
                this.title = title;
                this.genre = genre;
                this.duration = duration;
                this.viewed = false;
                this.timeViewed = 0;
        }
}

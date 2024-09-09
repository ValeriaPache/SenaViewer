package edu.misena.senaviewer.model;

public class Movie extends Film{
        private int id;
        //private String title;
        //private String genre;
        //private String creator;
        //private String duration;
        private int year;
        private boolean viewed;
        private int timeViewed;

        public Movie(String title, String genre, String creator, String duration, int year) {
                super( title,genre,creator,duration);
                this.year = year;
                this.viewed = false;
                this.timeViewed = 0;
        }

        /*public Movie(String title, String genre, String creator, int duration, int year) {
                this.title = title;
                this.genre = genre;
                this.creator = creator;
                this.duration = duration;
                this.year = year;
                this.viewed = false;
                this.timeViewed = 0;
        }*/

        public int getId() {
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

        /*public String getGenre() {
                return genre;
        }

        public void setGenre(String genre) {
                this.genre = genre;
        }*/

        /*public String getCreator() {
                return creator;
        }

        public void setCreator(String creator) {
                this.creator = creator;
        }*/

        /*public String getDuration() {
                return duration;
        }

        public void setDuration(String duration) {
                this.duration = duration;
        }*/

        public int getYear() {
                return year;
        }

        public void setYear(int year) {
                this.year = year;
        }

        public boolean getViewed() {
                return viewed;
        }

        public void setViewed(boolean viewed) {
                this.viewed = viewed;
        }

        public int getTimeViewed() {
                return timeViewed;
        }

        public void setTimeViewed(int timeViewed) {
                this.timeViewed = timeViewed;
        }

        @Override
        public String toString(){
                return super.toString() + ", Year: " + year + ", Viewed: " + viewed + ", TimeViewed: " + timeViewed ;
        }
}

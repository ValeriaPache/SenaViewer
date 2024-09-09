package edu.misena.senaviewer.model;

public class Magazine extends Publication{
        private int id;
        //private String title;
        //private String edititionDate;
        //private String editorial;
        private String authors;

        public Magazine(String title, String edititionDate, String editorial) {
                super( title, edititionDate, editorial);

        }

        /*public Magazine(String title, String editionDate, String editorial) {
                this.title = title;
                this.editionDate = editionDate;
                this.editorial = editorial;
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

        @Override
        public String toString(){
                return super.toString() ;
        }
}

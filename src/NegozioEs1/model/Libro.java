package model;

public class Libro extends Prodotto{
        private String isbn;
        private String Title ;
        private String category;
        private int pages;

        public String getCategory(){
            return  category;
        }

        public Libro(){
            super();
        }
        public Libro(double weight, double cost,  String isbn, String title, String  category, int pages){
            super(weight, cost);
            this. isbn = isbn;
            this.  Title = title;
            this. category = category;
            this.  pages = pages;
        }

        public String getIsbn(){
            return  this. isbn;
        }

        public String getTitolo(){
            return  this. Title;
        }

        @Override
        public String getAttribute(){
            return  this. category;
        }

        public double getPagine() {
            return this.pages;
        }
}

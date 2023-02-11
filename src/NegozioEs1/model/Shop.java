package model;
import java.awt.print.Book;
import java.util.ArrayList;
public class Shop {
    public static void main(String[] args) {

        ArrayList<Prodotto> prodotti = new ArrayList<>();

        Libro l1 = new Libro(2.5, 20.50, "12345", "LotR", "Fantasy", 1000 );
        Libro l2 = new Libro(3, 15.50, "23456", "It", "Horror", 800 );
        Libro l3 = new Libro(2.3, 12.0, "34567", "Cuore di drago", "Fantasy", 650);

        DVD d1 = new DVD(0.5, 9.50, "All Eyez on Me", "Classic Rap", 64);
        DVD d2 = new DVD(0.6, 12.45, "Dawn", "Pop", 50);
        DVD d3 = new DVD(0.7, 18.20, "Madreperla", "Rap", 55);

        RacchettaPadel R1  = new RacchettaPadel(1.7, 120, "Nike", "Drip Racing" );
        RacchettaPadel R2  = new RacchettaPadel(1.8, 99, "Adidas", "Round");
        RacchettaPadel R3 = new RacchettaPadel(1.9, 110, "Adidas", "Drip Racket");

        aggiungiProdotto(prodotti,l1);
        System. out. println("Aggiunto " + l1.getTitolo());
        aggiungiProdotto(prodotti, l2);
        System. out. println("Aggiunto " + l2.getTitolo());
        aggiungiProdotto(prodotti, l3);
        System. out. println("Aggiunto " + l3.getTitolo());
        System. out. println("Numero di prodotti presenti: " + prodotti. size());

        int numeroLibriFantasy= searchBooksNumberFantasy(prodotti);
        System. out. println("Libri fantasy: " + numeroLibriFantasy);

        aggiungiProdotto(prodotti, d1);
        System. out. println("Aggiunto " + d1.getTitolo());
        aggiungiProdotto(prodotti, d2);
        System. out. println("Aggiunto " + d2.getTitolo());
        aggiungiProdotto(prodotti, d3);
        System. out. println("Aggiunto " + d3.getTitolo());

        aggiungiProdotto(prodotti, R1);
        System. out. println("Aggiunto " + R1.getMarca());
        aggiungiProdotto(prodotti, R2);
        System. out. println("Aggiunto " + R2.getMarca());
        aggiungiProdotto(prodotti, R3);
        System. out. println("Aggiunto " + R3.getMarca());

        System. out. println(prodotti. size());

       // ArrayList<Prodotto>numberRackets = searchRackets("Drip");
       // System. out. println("Number of drip rackets: " + numberRackets. size());
    }

    private static int searchNumberBooksFantasy(ArrayList<Prodotto> prodotti) {
       int count=0;
       Libro libro= new Libro();
       for(Prodotto p:prodotti){
           if ( libro.getClass().equals(p.getClass())){
               if (((Libro) p).getCategory().equalsIgnoreCase("Fantasy")){
                   count++;
               }
           }

       }
       return count;
    }

    private static void pesaProdotti(ArrayList<Prodotto> prodotti, Book L1) {
    }

  //  private static ArrayList<Prodotto> searchRackets(String drip) {

   // }

    public static int counterProducts(ArrayList<Prodotto> Products){
        return Products. size();
    }

    public static double pesaProdotti(ArrayList<Prodotto> prodotti){
        int weight = 0;
        for (Prodotto p : prodotti){
            weight += p. getWeight();
        }
        return weight;
    }

    public static double getProdottoCostoso(ArrayList<Prodotto> prodotti){
        int cost = 0;
        for (Prodotto p : prodotti){
            if (p. getCosto() > cost){
                cost += p. getCost();
            }
        }
        return cost;
    }

    public static void aggiungiProdotto(ArrayList<Prodotto> p, Prodotto p1){
        p. add(p1);
    }

    public static int searchBooksNumberFantasy(ArrayList<Prodotto> product){
        int count = 0;
        for (Prodotto p : product){
            if (p. getAttribute(). equalsIgnoreCase("fantasy")){
                count++;
            }
        }
        return count;
    }

}


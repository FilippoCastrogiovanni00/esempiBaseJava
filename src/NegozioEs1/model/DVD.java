package model;

public class DVD extends Prodotto{
    private  String Title ;
    private String category;
    private double duration;

    public void Dvd(){}

    public DVD(double weight, double cost, String  title, String category, double duration ){
        super(weight, cost);
        this.  Title = title;
        this. category = category;
        this. duration = duration;
    }

    @Override
    public String getAttribute() {
        return null;
    }

    public String getTitolo() {
        return  this. Title;
    }

    public double getDurata() {
        return  this. duration;
    }
}


package model;

public class RacchettaPadel extends Prodotto{
    private String marca;
    private String tipo;

    public RacchettaPadel(){}

    public RacchettaPadel(double weight, double cost, String brand , String type ){
        super(weight, cost);
        this.  marca = brand;
        this.  tipo = type;
    }

    @Override
    public String getAttribute() {
        return  this. tipo;
    }

    public String getMarca() {
        return  this. marca;
    }
}


package main;

public class ibanez extends guitar{

    private String nameIbanez;
    private String colourIbanez;
    private double priceIbanez;

    public String getNameIbanez(){
        return nameIbanez;
    }

    public void setNameIbanez(String nameIB){
        nameIbanez = nameIB;
    }

    public String getColourIbanez(){
        return colourIbanez;
    }

    public void setColourIbanez(String colourIB){
        colourIbanez = colourIB;
    }

    public double getPriceIbanez(){
        return priceIbanez;
    }

    public void setPriceIbanez(double priceIB){
        priceIbanez = priceIB;
    }
}
package main;

class guitar {
    
    private String typeGuitar;
    private int jumlahString;
    private String bahan;

    public String getTypeGuitar(){
        return typeGuitar;
    }

    public void setTypeGuitar(String newType){
        typeGuitar = newType;
    }

    public int getJumlahString(){
        return jumlahString;
    }

    public void setJumlahString(int jumlah){
        jumlahString = jumlah;
    }

    
    public String getBahan(){
        return bahan;
    }

    public void setBahan(String bahanIB){
        bahan = bahanIB;
    }

}

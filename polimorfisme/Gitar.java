package polimorfisme;

public class Gitar extends Alat_Musik{
     @Override
    String setCaraMain(){
        String caraMain = "Dipetik";
        return caraMain;
    }
    
    @Override
    String setSuara(){
        String suara = "Gitar";
        return suara;
    }
    
    @Override
    int setHarga(){
        int harga = 950_000;
        return harga;
    }
    
}

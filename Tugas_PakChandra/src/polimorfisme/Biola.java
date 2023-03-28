package polimorfisme;

public class Biola extends Alat_Musik{
     @Override
    String setCaraMain(){
        String caraMain = "Digesek";
        return caraMain;
    }
    
    @Override
    String setSuara(){
        String suara = "Biola";
        return suara;
    }
    
    @Override
    int setHarga(){
        int harga = 1_500_000;
        return harga;
    }
    
}

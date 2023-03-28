package polimorfisme;

public class Drum extends Alat_Musik{
     @Override
    String setCaraMain(){
        String caraMain = "Dipukul";
        return caraMain;
    }
    
    @Override
    String setSuara(){
        String suara = "Drum";
        return suara;
    }
    
    @Override
    int setHarga(){
        int harga = 4_500_000;
        return harga;
    }
    
}

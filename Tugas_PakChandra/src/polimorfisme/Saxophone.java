package polimorfisme;

public class Saxophone extends Alat_Musik{
     @Override
    String setCaraMain(){
        String caraMain = "Dipencet dan ditiup";
        return caraMain;
    }
    
    @Override
    String setSuara(){
        String suara = "Saxophone";
        return suara;
    }
    
    @Override
    int setHarga(){
        int harga = 3_000_000;
        return harga;
    }
    
}

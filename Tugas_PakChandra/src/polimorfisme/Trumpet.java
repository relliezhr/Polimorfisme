package polimorfisme;

public class Trumpet extends Alat_Musik{
     @Override
    String setCaraMain(){
        String caraMain = "Ditiup";
        return caraMain;
    }
    
    @Override
    String setSuara(){
        String suara = "Trumpet";
        return suara;
    }
    
    @Override
    int setHarga(){
        int harga = 1_650_000;
        return harga;
    }
    
}

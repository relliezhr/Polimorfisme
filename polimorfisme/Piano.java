package polimorfisme;

public class Piano extends Alat_Musik{
    @Override
    String setCaraMain(){
        String caraMain = "Ditekan";
        return caraMain;
    }
    
    @Override
    String setSuara(){
        String suara = "Piano";
        return suara;
    }
    
    @Override
    int setHarga(){
        int harga = 9_000_000;
        return harga;
    }
    
}

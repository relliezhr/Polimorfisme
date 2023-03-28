package polimorfisme;

public abstract class Alat_Musik {
    abstract String setCaraMain();

    abstract String setSuara();
    
    abstract int setHarga();

    void getCaraMain(String caraMain) {
        System.out.println("Cara Main: "+caraMain);
    }

    void getSuara(String suara) {
        System.out.println("Suara: "+suara);
    }
    
    void getHarga(int harga){
        System.out.println("Harga: Rp. "+harga);
        System.out.println();
    }
}

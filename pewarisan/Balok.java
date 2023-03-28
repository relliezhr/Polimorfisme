package pewarisan;

public class Balok extends BangunRuang{
    @Override
    double volume(){
        System.out.println("Hitunglah Volume Bangun Ruang Balok:");
        panjang();
        lebar();
        tinggi();
        double volume = p*l*t;
        return volume;
    }
    
    
    @Override
    void run(){
        System.out.println("Volume Bangun Ruang Balok adalah = "+volume());
    }
}

package pewarisan;

public class Limas extends BangunRuang{
    @Override
    double volume(){
        System.out.println("Hitunglah Volume Bangun Ruang Limas Segiempat:");
        panjang();
        tinggi();
        double volume = 1 * ((p * p) * t) /3;
        return volume;
    }
    
    @Override
    void run(){
        System.out.println("Volume Bangun Ruang Limas Segiempat adalah = "+volume());
    }
    
}

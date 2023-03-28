package pewarisan;

public class Kubus extends BangunRuang{
   
    @Override
    double volume(){
        System.out.println("Hitunglah Volume Bangun Ruang Kubus:");
        panjang();
        double volume = p*p*p;
        return volume;
    }
    
    @Override
    void run(){
        System.out.println("Volume Bangun Ruang Kubus adalah = "+volume());
    }
    
}

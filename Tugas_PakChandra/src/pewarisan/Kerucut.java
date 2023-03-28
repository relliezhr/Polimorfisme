package pewarisan;

public class Kerucut extends BangunRuang{
    @Override
    double volume(){
        System.out.println("Hitunglah Volume Bangun Ruang Kerucut:");
        jari();
        tinggi();
        double volume = 0;
        if (r % 7 == 0) {
            volume = 1 * (22 * r * r * t / 7) / 3;
        } else if (r % 7 != 0) {
            volume = 1 * (3.14 * r * r *t) / 3;
        }
        return volume;
    }
    
    @Override
    void run(){
        System.out.println("Volume Bangun Ruang Kerucut adalah = "+volume());
    }
    
}

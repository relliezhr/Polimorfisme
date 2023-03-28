package pewarisan;

public class Tabung extends BangunRuang{
    @Override
    double volume(){
        System.out.println("Hitunglah Volume Bangun Ruang Tabung:");
        jari();
        tinggi();
        double volume = 0;
        if (r % 7 == 0) {
            volume = 22 * r * r * t / 7;
        } else if (r % 7 != 0) {
            volume = 3.14 * r * r *t;
        }
        return volume;
    }
    
    @Override
    void run(){
        System.out.println("Volume Bangun Ruang Tabung adalah = "+volume());
    }
}

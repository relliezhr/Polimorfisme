package pewarisan;

public class Bola extends BangunRuang{
    @Override
    double volume(){
        System.out.println("Hitunglah Volume Bangun Ruang Bola:");
        jari();
        double volume = 0;
        if (r % 7 == 0) {
            volume = 4 * (22 * r * r * r / 7) / 3;
        } else if (r % 7 != 0) {
            volume = 4 * (3.14 * r * r * r) / 3;
        }
        return volume;
    }
    
    @Override
    void run(){
        System.out.println("Volume Bangun Ruang Bola adalah = "+volume());
    }
}

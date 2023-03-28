package pewarisan;

import java.util.Scanner;

public class Prisma extends BangunRuang{
    
    double tA = 0;
    
    double tinggiAlas(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Tinggi Alas: ");
        tA = sc.nextDouble();
        return tA;
    }
    
    @Override
    double volume(){
        System.out.println("Hitunglah Volume Bangun Ruang Prisma Segitiga:");
        alas();
        tinggiAlas();
        tinggi();
        double volume = (1 * a * tA /3) * t;
        return volume;
    }
    
    @Override
    void run(){
        System.out.println("Volume Bangun Ruang Prisma Segitiga adalah = "+volume());
    }
}

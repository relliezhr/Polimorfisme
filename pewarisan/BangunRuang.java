package pewarisan;

import java.util.Scanner;

public class BangunRuang {
    Scanner sc = new Scanner(System.in);
    
    double p = 0;
    double l = 0;
    double t = 0;
    double r = 0;
    double a = 0;
    
    double panjang(){
        System.out.print("Masukkan panjang sisi: ");
        p = sc.nextDouble();
        return p;
    }
    
    double lebar(){
        System.out.print("Masukkan lebar sisi: ");
        l = sc.nextDouble();
        return l;
    }
    
    double tinggi(){
        System.out.print("Masukkan tinggi sisi: ");
        t = sc.nextDouble();
        return t;
    }
    
    double jari(){
        System.out.print("Masukkan jari-jari: ");
        r = sc.nextDouble();
        return r;
    }
    
    double alas(){
        System.out.print("Masukkan alas sisi: ");
        a = sc.nextDouble();
        return a;
    }
    
    double volume() {
        return 0;
    }
    
    void run(){
        
    }

    
}

package pewarisan;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Menghitung Volume Bangun Ruang: ");
        
            Kubus kubus = new Kubus();
            kubus.run();
            System.out.println();
            Balok balok = new Balok();
            balok.run();
            System.out.println();
            Tabung tabung = new Tabung();
            tabung.run();
            System.out.println();
            Kerucut kerucut = new Kerucut();
            kerucut.run();
            System.out.println();
            Limas limas = new Limas();
            limas.run();
            System.out.println();
            Prisma prisma = new Prisma();
            prisma.run();
            System.out.println();
            Bola bola = new Bola();
            bola.run();
        
        
    }
    
}

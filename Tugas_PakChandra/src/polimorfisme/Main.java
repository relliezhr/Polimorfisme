package polimorfisme;

public class Main {

    public static void main(String[] args) {
        Piano piano = new Piano();
        piano.getSuara(piano.setSuara());
        piano.getCaraMain(piano.setCaraMain());
        piano.getHarga(piano.setHarga());
        Biola biola = new Biola();
        biola.getSuara(biola.setSuara());
        biola.getCaraMain(biola.setCaraMain());
        biola.getHarga(biola.setHarga());
        Gitar gitar = new Gitar();
        gitar.getSuara(gitar.setSuara());
        gitar.getCaraMain(gitar.setCaraMain());
        gitar.getHarga(gitar.setHarga());
        Drum drum = new Drum();
        drum.getSuara(drum.setSuara());
        drum.getCaraMain(drum.setCaraMain());
        drum.getHarga(drum.setHarga());
        Saxophone saxophone = new Saxophone();
        saxophone.getSuara(saxophone.setSuara());
        saxophone.getCaraMain(saxophone.setCaraMain());
        saxophone.getHarga(saxophone.setHarga());
        Trumpet trumpet = new Trumpet();
        trumpet.getSuara(trumpet.setSuara());
        trumpet.getCaraMain(trumpet.setCaraMain());
        trumpet.getHarga(trumpet.setHarga());


    }
}

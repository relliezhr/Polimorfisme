package ClassificationOfAnimals;

public class Main {

    public static void main(String[] args) {
        System.out.println("Vertebrates: ");
        System.out.println("Warm-Blooded:");
        Mammals mammals = new Mammals();
        mammals.dataHewan();
        Birds birds = new Birds();
        birds.dataHewan();
        System.out.println();
        System.out.println("Cold_Blooded:");
        Fish fish = new Fish();
        fish.dataHewan();
        Reptiles reptiles = new Reptiles();
        reptiles.dataHewan();
        Amphibians amphibians = new Amphibians();
        amphibians.dataHewan();
        System.out.println("----------------------");
        System.out.println("Invertebrates: ");
        System.out.println("With Jointed Legs:");
        With3pairsoflegs withPairs = new With3pairsoflegs();
        withPairs.dataHewan();
        Withmorethan3 withMore = new Withmorethan3();
        withMore.dataHewan();
        System.out.println();
        System.out.println("Without Legs:");
        WormLike wormLike = new WormLike();
        wormLike.dataHewan();
        NotWormLike notWorm = new NotWormLike();
        notWorm.dataHewan();
    }
}

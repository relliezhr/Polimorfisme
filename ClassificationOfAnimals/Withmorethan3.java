package ClassificationOfAnimals;

public class Withmorethan3 implements DataHewan{
    @Override
     public void dataHewan(){
         System.out.println("With more than 3 pairs of legs:");
         String hewan1 = "Scorpion";
         String hewan2 = "Spider";
         String hewan3 = "Millipede";
         System.out.println(hewan1+"\n"+hewan2+"\n"+hewan3);
     }  
}

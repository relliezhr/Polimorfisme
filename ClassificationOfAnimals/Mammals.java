package ClassificationOfAnimals;

public class Mammals implements DataHewan{
    @Override
     public void dataHewan(){
         System.out.println("Mammals:");
         String hewan1 = "Bear";
         String hewan2 = "Tiger";
         String hewan3 = "Whale";
         System.out.println(hewan1+"\n"+hewan2+"\n"+hewan3);
     }      
}

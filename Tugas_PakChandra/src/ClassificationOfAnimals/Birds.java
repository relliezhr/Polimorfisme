package ClassificationOfAnimals;

public class Birds implements DataHewan{
    @Override
     public void dataHewan(){
         System.out.println("Birds:");
         String hewan1 = "Ostrich";
         String hewan2 = "Peacock";
         String hewan3 = "Eagle";
         System.out.println(hewan1+"\n"+hewan2+"\n"+hewan3);
     }  
}

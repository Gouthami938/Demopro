import java.util.*;
public class RateCard {
    public static void main(String[] args) {
        HashMap<String,Double>fruitData = new HashMap<>();
        HashMap<String,Integer>fruitData1= new HashMap<>();
        Double price=0.0;
        fruitData.put("type1",50.0);
        fruitData.put("type2",60.0);
        fruitData.put("type3",45.0);
        fruitData.put("type4",55.5);
        fruitData.put("type5",56.5);

        for(Map.Entry<String,Double>iterator:fruitData.entrySet()) {
            System.out.println("RateCard of " + iterator.getKey() + " price" + iterator.getValue());

        }
        fruitData1.put("type2",1);
        fruitData1.put("type4",2);
        fruitData1.put("type1",3);
        fruitData1.put("type5",4);
        fruitData1.put("type3",5);

        double amount=0;
        for(String iterator:fruitData1.keySet()){
            amount=fruitData1.get(iterator)*fruitData.get(iterator);
            System.out.println("Price of "+iterator+" is "+amount);

        }

    }
}

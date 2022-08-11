import java.util.*;
public class RateCard {
    public static void main(String[] args) {
        HashMap<String,Double>fruitData = new HashMap<>();
        fruitData.put("type1",50.0);
        fruitData.put("type2",60.0);
        fruitData.put("type3",45.0);
        fruitData.put("type4",55.5);
        fruitData.put("type5",56.5);
        for(Map.Entry<String,Double>iterator:fruitData.entrySet()){
            System.out.println("RateCard of "+iterator.getKey()+" price"+iterator.getValue());
        }


    }
}

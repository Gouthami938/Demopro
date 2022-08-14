import java.util.Arrays;
import java.util.List;
public class WildCardLowerEx {
    public static  void display(List<? super Integer> l){
        System.out.println(l);
    }

    public static void main(String[] args) {
        List<Integer> firstlist= Arrays.asList(1,2,3,4,5);
        display(firstlist);
        List<Object>thirdlist=Arrays.asList("Hi",89,0.9f);
        display(thirdlist);

    }
}



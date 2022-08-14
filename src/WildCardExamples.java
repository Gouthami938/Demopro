import java.util.Arrays;
import java.util.List;
public class WildCardExamples {
    public static  void display(List <?>l){
        System.out.println(l);
    }

    public static void main(String[] args) {
        List<Integer> firstlist= Arrays.asList(1,2,3,4,5);
        List<String>secondlist=Arrays.asList("one","two","three");

display(firstlist);
display(secondlist);
    }
}



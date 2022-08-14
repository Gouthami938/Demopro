import java.util.Arrays;
import java.util.List;
public class WildCardUpperEx {
    public static  void display(List<? extends Number> l){
            System.out.println(l);
        }

        public static void main(String[] args) {
            List<Integer> firstlist= Arrays.asList(1,2,3,4,5);
            display(firstlist);
            List<Float> firstlist1= Arrays.asList(1.0f,2.0f,3.0f,4.0f,5.0f);
            display(firstlist1);
        }
}

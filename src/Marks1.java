import java.util.ArrayList;
import java.util.*;
public class Marks1 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(90);
        marks.add(80);
        marks.add(67);
        marks.add(78);
        marks.get(2);
        int total = 0;
        float percentage;
        int total1= 0;
        float percentage1;

            for (int i = 0; i < marks.size(); i++) {
                System.out.println(marks.get(i) + " " + i);
                total = total + marks.get(i);
            }
            System.out.println(percentage = (total / marks.size()) * 100);
    try {
    marks.remove(2);
    }
    catch(ArrayIndexOutOfBoundsException e){
    System.out.println("Ignore");
}
    for (int i = 0; i < marks.size(); i++) {
        System.out.println(marks.get(i));
        total1 = total1 + marks.get(i);


    }
        System.out.println(percentage1 = (total1 / marks.size()) * 100);


    }
}

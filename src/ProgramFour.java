import java.util.Scanner;
public class ProgramFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
       //here variable a is marks
        int a[] = new int[size];
        for (int i = 1; i <=size; i++) {
            a[i] = sc.nextInt();
        }
        int maximum=Integer.MIN_VALUE;
        int minimum=Integer.MAX_VALUE;
        int minimum_index=0;
        int maximum_index=0;
        for (int i = 1; i <=size; i++) {
            if (a[i] > maximum) {
                maximum = a[i];
                maximum_index = i;
            }
            if (a[i] < minimum) {
                minimum = a[i];
                minimum_index = i;
            }
        }
        System.out.println("Rollno of students with maximum marks"+maximum_index);
        System.out.println("Rollno of students with minimum marks"+minimum_index);


    }
}



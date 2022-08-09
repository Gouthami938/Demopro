import java.util.Scanner;
public class UppercaseLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        if (string.equals(string.toUpperCase())) {
            System.out.println(string.toLowerCase());
        } else {
            System.out.println(string.toUpperCase());
        }
    }
}








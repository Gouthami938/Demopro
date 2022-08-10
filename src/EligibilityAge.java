import java.util.Scanner;
public class EligibilityAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            if (age > 25) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not Eligible");

            }

        } catch (Exception e) {
            System.out.println("Age is less");
        }
        finally{
            System.out.println("Age greater than 25 and above are eligible");
        }

    }
}
class EligibilityAge1 extends Exception{
    EligibilityAge1(String message){
       System.out.println("Checking age");

    }
}

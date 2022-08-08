import java.util.Scanner;
public class AssignmentProgramOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(num+" ");
        for (int i = 1; i <= num; i++) {
            if (num % 2 == 0) {       //if number is even
                num = num / 2;
                System.out.print(num+" ");
            } else {                  //if number is odd
                num = (3 * num) + 1;
                System.out.print(num+" ");
            }

        }

    }
}


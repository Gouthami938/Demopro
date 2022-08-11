import java.util.Scanner;
public class ProgramThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows=3;
        int column=4;

        System.out.println("Enter first character");
        String ch=sc.nextLine();

        System.out.println("Enter second character");
        String ch1=sc.nextLine();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
            }
            for(int j=1;j<=column-i;j++){
                System.out.print(ch1);
            }
            System.out.println();

        }

    }
}

import java.util.Scanner;
public class CalutatingWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float weight=sc.nextFloat();
        float weightincrease;
        float amount;
        if(weight>15){
        weightincrease=weight-15;
        amount=weightincrease*500;
            System.out.println("for "+weightincrease+ " weight amount to be paid is "+amount);
        }
        else{
            System.out.println("No need to pay");
        }

    }
}

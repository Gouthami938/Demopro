import java.util.Scanner;
interface Account{
    void deposit(float amount);
    double balance(int time,int ROI,float amount);
}
class Savings implements Account{
    double bal=0;
    @Override
    public void deposit(float amount) {bal= bal+amount; }
    @Override
    public double balance(int time,int ROI, float amount) {
        if(time<=75){return bal+bal*(1+(time/365)*ROI);
        }return bal;
    }}
class Current implements Account{double bal=0;
    @Override public void deposit(float amount) {bal+=amount;
    }@Override public double balance(int time,int ROI, float amount)
    {return bal+bal*(1+(time/365)*ROI);
    }}
public class BankProgram{
    public static void main(String[] args)
    {Scanner sc=new Scanner(System.in);
        System.out.println("Enter account type:");
        String accountant=sc.next();
        System.out.println("Time period");
        int time=sc.nextInt();
        System.out.println("Enter amount");
        float amount=sc.nextFloat();
        System.out.println("Enter interest");
        int ROI=sc.nextInt();
        if(accountant.equals("savings")){Savings s=new Savings();

            String deposit=sc.next();
            if(deposit.equals("y")){System.out.println("Enter deposit amount");
                float dep=sc.nextFloat();
                s.deposit(dep);
            }System.out.println(s.balance(time,ROI,amount));
        }
        else{
            Current c=new Current();

            String deposit=sc.next();
            if(deposit.equals("y")){
                System.out.println("Enter deposit amount");
                float dep=sc.nextFloat();
                c.deposit(dep);
            }System.out.println(c.balance(time,ROI,amount));
        }}}

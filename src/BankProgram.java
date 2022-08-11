abstract class InterestCalculating{
    String name;
    int balance;
    public InterestCalculating(String n,int bal){
        this.name = n;
        this.balance =bal;
    }
    public abstract double calInterest(double time);
    public void deposit(int amount){
        balance+=amount;
    }
}
class SavingsAccount extends InterestCalculating{
    //Given interest 3 for saving
    public SavingsAccount(String name,int balance){
        super(name,balance);
    }
    public  double calInterest(double time){
        double amt = (balance*time*3)/100;     //Given interest 3 for saving

        return (amt);
    }
}
class CurrentAccount extends InterestCalculating{
   //for current account interest is 0
    public CurrentAccount(String name,int balance){
        super(name,balance);
    }
    public  double calInterest(double time){
        return 0;
    }
    public boolean withamt(double amount){ //withamt=withdraw amount
        double range= (double)( balance + (0.2*balance)) ;
        return (amount <= range);
    }
}
public class BankProgram {
    public static void main(String[] args) {
        SavingsAccount object1= new SavingsAccount("Amritha",100000);
        CurrentAccount object2= new CurrentAccount("Gopal",50000);
        object2.deposit(10000);
        System.out.println( object1.name +" Balance :"+object1.balance);
        System.out.println(object2.name+ "  Balance :"+object2.balance);
        System.out.println( "Interest of Amritha"+ object1.calInterest(0.25));
        System.out.println( "Interest of Gopal"+ object2.calInterest(0.25));
    }
}
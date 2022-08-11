public class ExceptionEx1 {
    public static void main(String[] args) {
        int number = 10;
        try{
            int number2=10/0;
        }
        catch(ArithmeticException e){
            System.out.println("Ignore");
        }
    }
}

public class ExceptionEx2 {
    public static void main(String[] args) {
        String string=null;
        try{
            int length=string.length();
        }catch(NullPointerException e){
            System.out.println("Ignore");
        }
    }
}

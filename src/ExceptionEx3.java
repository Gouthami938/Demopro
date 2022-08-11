public class ExceptionEx3 {
    public static void main(String[] args) {
        int array[] = new int [2];
        try{
            System.out.println(array[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("Ignore");

        }
    }
}

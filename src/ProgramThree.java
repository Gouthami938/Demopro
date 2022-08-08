public class ProgramThree {
    public static void main(String[] args) {
        int r=3;
        int c=4;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print("1");
            }
            for(int j=1;j<=c-i;j++){
                System.out.print("2");
            }
            System.out.println();

        }
      /* for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print("2");
            }
            System.out.println();

        }*/
    }
}

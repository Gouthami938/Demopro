import java.util.Scanner;

public class ProgramOne {
    public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);

            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            int n=sc.nextInt();
            if(n<x && n<y && n<z){

                if(x<y && x<z){

                    System.out.println("L1");

                }
                else if(y<z){
                    System.out.println("L2");

                }
                else {
                    System.out.println("L3");

                }
            }
            //if the if condition fails then it checks elseif block
            else if(n<x&&n<y){
                if(x<y){
                    System.out.println("L1");

                }
                else{
                    System.out.println("L2");

                }
            }
            else if(n<x&&n<z){
                if(y<z){
                    System.out.println("L2");

                }
                else{
                    System.out.println("L3");

                }
            }
            else if(n<x){
                System.out.println("L1");

            }
            else if(n<y){
                System.out.println("L2");

            }
            else if(n<z){
                System.out.println("L3");

            }
            else{
                System.out.println("Nothing");

            }
        }



    }



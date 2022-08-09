import java.util.Scanner;
import java.util.Arrays;
public class ArrayProgram {
    public static void main(String[] args) {
       // Scanner sc = new Scanner (System.in);
       // int size = sc.nextInt();
        int array[]={2,3,4,2,5,6};
        int sum=0;
        //Mean of array
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        System.out.println("Mean"+ sum/array.length);

        //Median for even number of array elements and for odd

        Arrays.sort(array);
        if((array.length)%2!=0) {
            System.out.println("Median"+array[array.length / 2]);
        }
        else{
            System.out.print("Median");
            System.out.println(array[array.length / 2]+array[array.length / 2-1]/2);
        }

       // System.out.println("Median"+array.length/2);
        //Mode
        int num=-1;
        int numApperanceMaximum=-1;
                for(int i=0;i<array.length;i++){
                    int countvariable=0;
                    for(int j=0;j<array.length;j++){
                        if(array[i]==array[j])
                            countvariable++;
                    }
                    if(countvariable>numApperanceMaximum){
                        num=array[i];
                        numApperanceMaximum=countvariable;
                    }
                }
                System.out.println("Mode"+num);
    }
}

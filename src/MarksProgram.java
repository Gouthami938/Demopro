
import  java.util.Arrays;
import java.util.Scanner;
public class MarksProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int students = 3;
        String name[] = new String[students];
        int rollno[] = new int[students];
        int english[] = new int[students];
        int computerscience[] = new int[students];
        int social[] = new int[students];
        int maths[] = new int[students];
        int science[] = new int[students];
        int totalmarks[] = new int[students];
        double avgMarks[] = new double[students];
        int totalsortedmarks[] = new int[students];
        int markstotal = 0;
        int i;
        for (i = 0; i < 3; i++) {
            System.out.println("Enter roll");
            rollno[i] = sc.nextInt();
            //  name[i] = sc.nextLine();
            // english[i] = sc.nextInt();
            //  computerscience[i] = sc.nextInt();
            // social[i] = sc.nextInt();
            maths[i] = sc.nextInt();
            science[i] = sc.nextInt();
            totalmarks[i] = (english[i] + computerscience[i] + social[i] + maths[i] + science[i]);
            avgMarks[i] = (english[i] + computerscience[i] + social[i] + maths[i] + science[i]) / 5;
            System.out.println("Total marks of student" + i + " is " + totalmarks[i]);
            System.out.println("average marks of student" + i + " is " + avgMarks[i]);
            //  System.out.println(Arrays.sort(totalmarks[i]));
        }
        int totalmark[] = totalmarks;
       // int roll[] = new [students];
        int r=students;
       Arrays.sort(totalmark);
        for (int j = 0; j < totalmarks.length; j++) {
            if(totalmark[j]>totalmarks[total]){
            total=j;r--;}


            System.out.println("Student with rollno:"+rollno[total]+" SecuredMarks " +totalmark[j]+" and rank is "+ r);

        }

        System.out.println("Top one Performer marks"+totalmark[total]);
        System.out.println("Top two Performer marks"+totalmark[total-1]);
        System.out.println("Top three Performer marks"+totalmark[total-2]);
//Average Performers
        for( i=0;i<students;i++){
            if(totalmarks[i]<50){
                System.out.println(" student "+rollno[i]+" total marks "+totalmarks[i]);
            }
        }

        int rank = 1;
        for (int j = 0; j < totalmarks.length; j++) {
            //  for (int k = 0; k < students; k++) {
            if (totalmarks[j] > totalmarks[total]) {
                total = j;
            }

        }
        System.out.println(rollno[total] + " got " + totalmarks[total] + " so " + rank);

    }

    }











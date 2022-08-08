import java.util.Scanner;
public class AssignmentProgramTwo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int treenum=sc.nextInt();
        int a[][]=new int[rows][columns];
        for(int i=0;i<rows;i++){
            a[i][0]=-1;
            a[i][columns-1]=-1;
        }
        for(int i=0;i<columns;i++){
            a[0][i]=-1;
        }
        int count=1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(count++==treenum){
                    String ans=  (a[i][j]==-1)?"yes":"no";
                    System.out.println(ans);

                }
            }
        }
    }
}







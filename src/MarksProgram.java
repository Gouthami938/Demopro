import java.util.Scanner;
public class MarksProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = 15;
        int english[] = new int[students];
        int computerscience[] = new int[students];
        int social[] = new int[students];
        int maths[] = new int[students];
        int science[] = new int[students];
        int totalmarks[] = new int[students];
        double avgMarks[] = new double[students];
        for (int i = 0; i < students; i++) {
            english[i] = sc.nextInt();
            computerscience[i] = sc.nextInt();
            social[i] = sc.nextInt();
            maths[i] = sc.nextInt();
            science[i] = sc.nextInt();
            totalmarks[i] = (english[i] + computerscience[i] + social[i] + maths[i] + science[i]);
            avgMarks[i] = (english[i] + computerscience[i] + social[i] + maths[i] + science[i]) / 5;
            System.out.println("Total marks of each student" + totalmarks[i]);
            System.out.println("average marks of each student" + avgMarks[i]);

        }
        int englishTotal = 0, mathsTotal = 0, scienceTotal = 0, socialTotal = 0, computerscienceTotal = 0;
        for (int i = 0; i < students; i++) {
            englishTotal += english[i];
            mathsTotal += maths[i];
            scienceTotal += science[i];
            scienceTotal += social[i];
            computerscienceTotal += computerscience[i];

        }
        System.out.println("Average in english" + ((double) englishTotal / students));
        System.out.println("Average in maths" + ((double) mathsTotal / students));
        System.out.println("Average in science" + ((double) scienceTotal / students));
        System.out.println("Average in social" + ((double) socialTotal / students));
        System.out.println("Average in computerscience" + ((double) computerscienceTotal / students));


    }
}
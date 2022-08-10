import java.util.Scanner;

public class CharacterChange {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String string = sc.nextLine();
           for(int i=0;i<string.length();i++){
               int ch=string.charAt(i);
               if(ch>64 && ch<91){
                   ch=ch+32;
                   System.out.print((char)ch);
               }
               else if(ch>96&&ch<123){
                   ch=ch-32;
                   System.out.print((char)ch);
               }
               if(ch==32)
                   System.out.print(" ");
           }



        }
    }


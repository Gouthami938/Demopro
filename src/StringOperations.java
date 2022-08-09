import java.util.*;
public class StringOperations {
    public static void main(String[] args) {
        Scanner sc  =new Scanner (System.in);
        String anystring=sc.nextLine();
        String reverse=" ";
        String str = "Hii";
        String str1="Goodmrg";
        String string = new String(anystring);
        int Length=anystring.length();
        //Length of string
        System.out.println(Length);
        String merge= str+str1;
        //mergering
        System.out.println(merge);
       //spliting
        String a[]=str.split("i",1);
        for(String a : str) {
            System.out.println(a);
        }
//Reversing the String
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
             reverse = ch+reverse;
        }
        System.out.println(reverse);
        //Finding string is equal or not
        boolean difference = str.equals(str1);
        System.out.println(difference);
    }
}

import java.util.Scanner;
public class Programtwo {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        int sun_day=sc.nextInt();
        int mon_day=sc.nextInt();
        int tue_day=sc.nextInt();
        int wed_day=sc.nextInt();
        int thus_day=sc.nextInt();
        int fri_day=sc.nextInt();
        int sat_day=sc.nextInt();
        int r1,r2,r3,r4,r5,r6,r7,r8 = 0;
        int bonus,bonusrate;
        int hour=100;
        r1=sun_day*150;
        r2=mon_day*hour;
        r3=tue_day*hour;
         r4= wed_day*hour;
        r5=thus_day*hour;
        r6=fri_day*hour;
        r7=sat_day*125;
        int extrahour=15;
        int days,totaldays,totalr;
        r1=sun_day*150;
        if(mon_day<=8){
            System.out.println(r2);
        }
        else if(mon_day > 8){
            bonus=mon_day - 8;
            bonusrate=bonus*115;
            r2=bonusrate+800;
        }
        if(tue_day<=8){
            System.out.println(r3);
        }
        else if(tue_day > 8){
            bonus=tue_day - 8;
            bonusrate=bonus*115;
            r3=bonusrate+800;
        }
        if(wed_day<=8){
            System.out.println(r4);
        }
        else if(wed_day > 8){
            bonus=wed_day - 8;
            bonusrate=bonus*115;
            r4=bonusrate+800;
        }
        if(thus_day<=8){
            System.out.println(r2);
        }
        else if(thus_day > 8){
            bonus=thus_day - 8;
            bonusrate=bonus*115;
            r5=bonusrate+800;
        }
        if(fri_day<=8){
            System.out.println(r6);
        }
        else if(fri_day > 8){
            bonus=fri_day - 8;
            bonusrate=bonus*115;
            r6=bonusrate+800;
        }
        totaldays=mon_day+tue_day+wed_day+thus_day+fri_day;
        if(totaldays>40){
            days=totaldays-40;
            r8=days*25;
        }
        totalr=r1+r2+r3+r4+r5+r6+r7+r8;
        System.out.println(totalr);

    }
}

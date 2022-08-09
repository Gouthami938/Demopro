
class Holiday {
    private String name;
    private int day;
    private String month;

    Holiday(String n, int d, String m) {
        this.name = n;
        this.day = d;
        this.month = m;
    }

    public static boolean inSameMonth(Holiday holiday, Holiday holiday1) {
        return (holiday.month.equals(holiday1.month));
    }

    public static double avgDate(Holiday[] holiday) {
        int total = 0;
        for (int i = 0; i < holiday.length; i++) {
            total = total + holiday[i].day;
        }
        return ((double) total) / holiday.length;

    }
}
    public class OopProgram {
    public static void main(String[] args) {
        Holiday object1 = new Holiday("IndependanceDay", 15, "august");
        Holiday object2 = new Holiday("Day", 4, "july");
        Holiday holiday[];
        holiday = new Holiday[2];
        holiday[0] = object1;
        holiday[1] = object2;
        System.out.println(Holiday.avgDate(holiday));
        System.out.println(Holiday.inSameMonth(object1, object2));

    }
}


















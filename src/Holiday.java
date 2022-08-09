public class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String n, int d, String m) {
        name = n;
        day = d;
        month = m;
    }

    public boolean inSameMonth(Holiday holiday) {
        return this.month.equals(holiday.month);
    }

        public static double avgDate (Holiday[] holiday){
            int total = 0;
            for (int i = 0; i < holiday.length; i++) {
                total = total + holiday[i].day;
            }
            return ((double) total) / holiday.length;

        }

    public static void main(String[] args) {
        Holiday holiday = new Holiday("IndependanceDay",4,"july");

    }
    }


public class MyDate {
    int day;
    int month;
    int year;


    public void setDay(int day) {
        if (day <= 0 || day > 31) throw new IllegalArgumentException("Day no valid  ");
        if (day == 31 && (this.month != 1
                || this.month != 3
                || this.month != 5
                || this.month != 7
                || this.month != 8
                || this.month != 10
                || this.month != 12)) throw new IllegalArgumentException("Day no valid ");
        if (day == 30 && this.month == 2) throw new IllegalArgumentException("Day no valid  ");
        else {
            this.day = day;
        }

    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) throw new IllegalArgumentException("Month no valid");
        else {
            this.month = month;
        }
    }

    public void setYear(int year) {
        if (year < 1 ) throw new IllegalArgumentException("Year no valid");
        else {
            this.year = year;
        }
    }
}
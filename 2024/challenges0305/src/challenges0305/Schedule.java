package challenges0305;

public class Schedule {
    private int day;
    private int month;
    private int year;

    public Schedule(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Dia inválido. Insira um valor entre 1 e 31.");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Mês inválido. Insira um valor entre 1 e 12.");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1900) {
            this.year = year;
        } else {
            System.out.println("Ano inválido. Insira um valor maior ou igual a 1900.");
        }
    }

    public void printDate() {
        System.out.println(day + "/" + month + "/" + year);
    }

    public int daysUntilMonth(int targetMonth) {
        int days = 0;
        for (int i = 1; i < targetMonth; i++) {
            switch (i) {
                case 1, 3, 5, 7, 8, 10, 12:
                    days += 31;
                    break;
                case 4, 6, 9, 11:
                    days += 30;
                    break;
                case 2:
                    if (isLeapYear(year)) {
                        days += 29;
                    } else {
                        days += 28;
                    }
                    break;
                default:
                    break;
            }
        }
        return days;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

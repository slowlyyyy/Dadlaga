public class Problem10 {
    public static boolean isInteresting(int year, int month, int day) {
        boolean[] digitSeen = new boolean[10];
        
        while (year > 0) {
            int digit = year % 10;
            if (digitSeen[digit]) return false;
            digitSeen[digit] = true;
            year /= 10;
        }
        
        do {
            int digit = month % 10;
            if (digitSeen[digit]) return false;
            digitSeen[digit] = true;
            month /= 10;
        } while (month > 0);
        
        do {
            int digit = day % 10;
            if (digitSeen[digit]) return false;
            digitSeen[digit] = true;
            day /= 10;
        } while (day > 0);
        
        return true;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return 29;
            } else {
                return 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    public static void main(String[] args) {
        int targetYear = 2013;
        int targetMonth = 4;
        int targetDay = 5;
        
        int currentYear = targetYear;
        int currentMonth = targetMonth;
        int currentDay = targetDay - 1;

        int previousInterestingYear = 0;
        int previousInterestingMonth = 0;
        int previousInterestingDay = 0;
        
        while (true) {
            if (currentDay == 0) {
                currentMonth--;
                if (currentMonth == 0) {
                    currentMonth = 12;
                    currentYear--;
                }
                currentDay = getDaysInMonth(currentMonth, currentYear);
            }
            if (isInteresting(currentYear, currentMonth, currentDay)) {
                previousInterestingYear = currentYear;
                previousInterestingMonth = currentMonth;
                previousInterestingDay = currentDay;
                break;
            }
            currentDay--;
        }
        
        System.out.println("Omnoh sonirholtoi odor: " + previousInterestingYear + "-" + previousInterestingMonth + "-" + previousInterestingDay);
        
        int monthsCount = 0;
        int year = previousInterestingYear;
        int month = previousInterestingMonth;
        
        while (year < targetYear || (year == targetYear && month < targetMonth)) {
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
            monthsCount++;
        }
        
        System.out.println("Ongorson niit sariin too: " + monthsCount);
    }
}
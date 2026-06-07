public class Problem6 {
    public static void main(String[] args){
        boolean isFirst = true;
        int Niitbolomj = countNumbers(10, 4, true);
        System.out.println("Niit bolomj: " + Niitbolomj);
    }

    public static int countNumbers(int uldsenOron, int sumLeft, boolean isFirst){
        if (sumLeft < 0){
            return 0;
        }
        if (uldsenOron == 0){
            return sumLeft == 0 ? 1 : 0;
        }
        int count = 0;
        int startDigit = isFirst ? 1 : 0;
        for (int digit = startDigit; digit <= 9; digit++){
            count += countNumbers(uldsenOron - 1, sumLeft - digit, false);
        }
        return count;
    }

}
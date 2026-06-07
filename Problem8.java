public class Problem8{
    public static void main(String[] args){
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 1; i <= 999; i++){
            if (getDigitSum(i) == getDigitSum(i)){
                if (i % 2 == 0){
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }
        System.out.println("Niilber ni tegsh too baih:" + evenCount);
        System.out.println("Niilber ni sondgoi too baih:" + oddCount);
    }

    public static int getDigitSum(int number){
        int sum = 0;
        while (number > 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
public class FindNumber{
    static int count = 0;
    public static void main(String[] args){
        int start = 1000;
        int end = 9999;
        for(int i = start; i <= end; i++ ) {
            int original = i;
            count++;
            int reversed = reverseNumber(i);
            if(reversed >= 1000 && reversed <= 9999){
                long longProduct = (long) original * reversed;
                if(longProduct % 1000 == 0){
                    count ++;
                    System.out.println("Original: " + original + ", Reversed: " + reversed + ", Product: " + longProduct);
                }
            }
        }
        
    }

    public static int reverseNumber(int num){
        int reversed = 0;
        while(num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}

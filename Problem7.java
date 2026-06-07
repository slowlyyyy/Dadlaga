public class Problem7 {
    public static void main(String[] args) {
        int evenCount = 0; 
        int oddCount = 0;

        
        for (int i = 10000; i <= 99999; i++) {
            if (getDigitSum(i) == 37) {
                if (i % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }

        System.out.println("А (Тэгш тоонууд): " + evenCount);
        System.out.println("Б (Сондгой тоонууд): " + oddCount);
        
        if (evenCount > oddCount) {
            System.out.println("А нь Б-гээс " + (evenCount - oddCount) + "-ээр олон.");
        } else if (oddCount > evenCount) {
            System.out.println("Б нь А-аас " + (oddCount - evenCount) + "-ээр олон.");
        } else {
            System.out.println("Хоёулаа тэнцүү.");
        }
    }


    public static int getDigitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
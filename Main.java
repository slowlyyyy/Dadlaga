public class Main {
    static int count = 0;
    public static void main(String[] args) {
        int start = 1000110;
        int end = 9999999;
        for (int i = start; i <= end; i += 111){
            if (i % 1000 == 111){
                count ++;
                if(count <= 5){
                    System.out.println(i);
                }
            }  
        }
        System.out.println("Total count: " + count);
        
    }
}
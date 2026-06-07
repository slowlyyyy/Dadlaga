public class Problem9{
    public static boolean IjilToo(int num){
        boolean[] digitSeen = new boolean[10];
        while (num > 0){
            int digit = num % 10;
            if (digitSeen[digit]){
                return true;
            }
            digitSeen[digit] = true;
            num /= 10;    
                

    }
    return false;
}
 public static void main(String[] args){
    int count = 0;
    for ( int i = 100000; i <= 999999; i++){
        if (IjilToo(i)){
            count++;
        
        }
    }
    System.out.println("6 orontoi niit too: " + (999999 - 100000 + 1));
    System.out.println("Ijil digit baih too: " + count);
 }
    
    
}
public class Problem17{
    public static void main(String[] args){
        int n = 5;
        int niilber = 0;
        int center = n / 2;
        int[][] num = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                num[i][j] = (int)(Math.random() * 100);
                
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i <= center; i++){
            for(int j = i; j <= n-1-i; j++){
                niilber += num[i][j];
            }
        }
        System.out.println("Gurvaljin hureen deh elementuudiin niilber: " + niilber);

    }
}
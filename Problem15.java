public class Problem15{
    public static void main(String[] args){
        int n = 4;
        int m = 3;
        int sumValue = 0;
        int[][] num1 = new int[n][m];
        int[][] sum = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                num1[i][j] = (int)(Math.random() * 100);
                
                System.out.print(num1[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i == 0 || i == n-1 || j == 0 || j == m-1){
                    sumValue += num1[i][j];
                    
                }
            }
            
        }
        System.out.println("Hureenii niilber: " + sumValue);
    }
    }
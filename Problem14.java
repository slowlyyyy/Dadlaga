public class Problem14{
    public static void main(String[] args){
        int n = 4;
        int[][] num = new int[n][n];
        int diagonalSum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                num[i][j] = (int)(Math.random() * 100);
                System.out.print(num[i][j] + " ");
                if(i == j){
                    diagonalSum += num[i][j];
                }
            }
            System.out.println();
            
        }
        System.out.println("Diagonal Sum: " + diagonalSum);
    }
}
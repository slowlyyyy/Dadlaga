public class Problem18{

    public static void main(String[] args){
        int n = 4;
        int sum = 0;
        int rowCount = n;
        int colCount = n;
        int max = Integer.MIN_VALUE;
        int[][] num = new int[rowCount][colCount];

        for(int i = 0; i < rowCount; i++){
            for(int j = 0; j < colCount; j++){
                num[i][j] = (int)(Math.random() * 100);
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        int maxRow = 0;
        int maxCol = 0;
        for(int i = 0; i < rowCount - 1; i++){
            for(int j = 0; j < colCount - 1; j++){
                sum = num[i][j] + num[i][j + 1] + num[i + 1][j] + num[i + 1][j + 1];
                if(sum > max){
                    max = sum;
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println("Hamgiin ih 2x2 matritsiin  sum: (" + maxRow + ", " + maxCol + ") = " + max);
        for(int i = maxRow; i < maxRow + 2; i++){
            for(int j = maxCol; j < maxCol + 2; j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    
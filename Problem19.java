import java.util.Arrays;
import java.util.Scanner;

public class Problem19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Matritsiin moriin toog oruul:");
        int rows = sc.nextInt();
        System.out.println("Matritsiin bagana iin toog oruul:");
        int cols = sc.nextInt();

        System.out.println("Matrixiin elementuudee  oruulah");

        int matrix[][] = new int[rows][cols];
        int ergesenMatrix[][] = new int[cols][rows];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                matrix[i][j] = sc.nextInt();
            } 
        }
         System.out.println("Oruulsan matrixiig hevleh");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(matrix[i][j] + " ");
            } 
            System.out.println();
        }
        System.out.println("ergesen matrixiig uusgeh");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                 ergesenMatrix[j][i] = matrix[i][j];
            } 
        }
        
        for(int i = 0; i < rows; i++){
            int left = 0;
            int right = rows - 1;
            while(left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("Ergeesen matrixiig hevleh");
        for(int i = 0; i < cols; i++){
            for(int j = 0; j < rows; j++){
                System.out.print(ergesenMatrix[i][j] + " ");
            } 
            System.out.println();
        }
    }
}

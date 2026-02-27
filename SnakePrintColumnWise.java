// import java.util.*;
// class snakeColumnWise
// {
//     public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);

//         int arr[][] = { {2, 8, 3, 4, 7}, {7, 2, 1, 6, 3}, {5, 5, 4, 1, 4}, {3, 1, 8, 2, 6} };

//         int rows = arr.length;
//         int columns = arr[0].length;

//         for(int j=0; j<columns; j++)
//         {
//             if(j % 2 == 0)
//             {
//                 for(int i=0; i<rows; i++)
//                 {
//                     System.out.print(arr[i][j]+" ");
//                 }
//             }
//             else
//             {
//                 for(int i=rows-1; i>=0; i--)
//                 {
//                     System.out.print(arr[i][j]+" ");
//                 }
//             }
//             //System.out.println();
//         }
//     }
// }

import java.util.ArrayList;
import java.util.List;

public class SnakePrintColumnWise {
    
    /**
     * Print 2D array in snake pattern column-wise
     * - Even column indices (0, 2, 4...): top to bottom
     * - Odd column indices (1, 3, 5...): bottom to top
     */
    public static List<Integer> snakePrintColumnWise(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        for (int col = 0; col < cols; col++) {
            if (col % 2 == 0) {
                // Even column index: go top to bottom
                for (int row = 0; row < rows; row++) {
                    result.add(matrix[row][col]);
                }
            } else {
                // Odd column index: go bottom to top
                for (int row = rows - 1; row >= 0; row--) {
                    result.add(matrix[row][col]);
                }
            }
        }
        
        return result;
    }
    
    // Helper method to print matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.print("[");
            for (int i = 0; i < row.length; i++) {
                System.out.printf("%2d", row[i]);
                if (i < row.length - 1) System.out.print(", ");
            }
            System.out.println("]");
        }
    }
    
    // Helper method to print result with arrows
    public static void printResult(List<Integer> result) {
        System.out.println(result);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // Example 1: 3x3 matrix
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        
        System.out.println("\nSnake column-wise traversal:");
        List<Integer> result1 = snakePrintColumnWise(matrix1);
        printResult(result1);
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Example 2: 4x5 matrix
        int[][] matrix2 = {
            {1,  2,  3,  4,  5},
            {6,  7,  8,  9,  10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20}
        };
        
        System.out.println("Matrix 2:");
        printMatrix(matrix2);
        
        System.out.println("\nSnake column-wise traversal:");
        List<Integer> result2 = snakePrintColumnWise(matrix2);
        printResult(result2);
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Example 3: 2x4 matrix
        int[][] matrix3 = {
            {10, 20, 30, 40},
            {50, 60, 70, 80}
        };
        
        System.out.println("Matrix 3:");
        printMatrix(matrix3);
        
        System.out.println("\nSnake column-wise traversal:");
        List<Integer> result3 = snakePrintColumnWise(matrix3);
        printResult(result3);
    }
}
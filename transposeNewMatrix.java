import java.util.*;
class transposeNewMatrix
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int arr[][] = { {1, 6, 8, 3}, {4, 2, 7, 5} };
        int transposed[][] = new int[arr[0].length][arr.length]; 
        // new matrix declaration with the no. of rows = no. of columns & vice versa

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[0].length; j++)
            {
                //int temp = arr[i][j];
                transposed[j][i] = arr[i][j];
            }
        }
        for(int i=0; i<transposed.length; i++)
        {
            for(int j=0; j<transposed[0].length; j++)
            {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
import java.util.*;
class rotate90
{
    static void rotate(int arr[][])
    {
        //Transpose
        for(int i=1; i<arr.length; i++)
        {
            for(int j=0; j<i; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //reverse each column
        for(int i=0; i<arr.length; i++)
        {
            int startCol = 0;
            int endCol = arr[0].length-1;
            while(startCol < endCol)
            {
                int temp = arr[i][startCol];
                arr[i][startCol] = arr[i][endCol];
                arr[i][endCol] = temp;
                startCol++;
                endCol--;
            }
        }
        //return arr[][]
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int arr[][] = { {2, 8, 3, 4}, {7, 2, 1, 6}, {5, 5, 4, 1}, {3, 1, 8, 2}};
        //System.out.println(rotate(arr[][]));

    }
}
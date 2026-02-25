import java.util.*;
class transpose
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int arr[][] = { {2, 8, 3, 4}, {7, 2, 1, 6}, {5, 5, 4, 1}, {3, 1, 8, 2} };

        for(int i=1; i<arr.length; i++) // runs for the no. of rows times
        {
            for(int j=0; j<i; j++) // runs from o to i-1
            {
                int temp = arr[i][j];  // storing the value in temp
                arr[i][j] = arr[j][i]; // assigning the transposed value
                arr[j][i] = temp;  // at transposed position, putting the above element
            }
        }

        for(int i=0; i<arr.length; i++) // loop to print the transposed matrix
        {
            for(int j=0; j<arr[0].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // changing line after every row
        }
    }
}
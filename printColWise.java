import java.util.*;
class printColWise
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int arr[][] = { {2, 8, 3, 4, 7}, {7, 2, 1, 6, 3}, {5, 5, 4, 1, 4}, {3, 1, 8, 2, 6} };

        for(int i=0; i<arr[0].length; i++) // no. of i iterations = total no. of columns in old array or no. of rows in new array
        {
            for(int j=0; j<arr.length; j++) // no. of j iteration = total no. of rows in old array or no. of columns in new array
            {
                System.out.print(arr[j][i] + " ");// keeping i fix, fetching elements changing j every case : 0,0 1,0 2,0 ,3,0
                // keeping i fix and changing j; but also taking elements from different rows each time;
                // picking first element from each row by changing the second value each time;
            }
            System.out.println(); // changing line after completing one row of new array
        }
    }

}
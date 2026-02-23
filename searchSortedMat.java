import java.util.*;
class searchSortedMat
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // int arr[][] = {
        //     {1, 4, 7, 11, 15},
        //     {2, 5, 8, 12, 19},
        //     {3, 6, 9, 16, 22},
        //     {10, 13, 14, 17, 24},
        //     {18, 21, 23, 26, 30}
        // };
        
        double arr[][] = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {2.5, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };

        int row = arr.length;
        int col = arr[0].length;
        int i = 0;
        int j = col - 1;
        int target = 3;
        int flag = 0;

        while(i<row && j>=0)
        {
            if(arr[i][j] > target)
                j--;
            else if(arr[i][j] < target)
                i++;
            else
            {
                flag = 1;
                break;
            }
        }
        if(flag == 1)
            System.out.println("found");
        else
            System.out.println("not found");

    }
}
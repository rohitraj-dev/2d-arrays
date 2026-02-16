import java.util.*;
class MinEachRow
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int arr[][] = {{2, 8, 3, 4, 7}, {7, 2, 1, 6, 3}, {5, 5, 4, 1, 4}, {3, 1, 8, 2, 6}};

        ArrayList<Integer> maxInRows = new ArrayList<>();
        int maxInARow = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[0].length; j++)
            {
                if(arr[i][j] > maxInARow)
                    maxInARow = arr[i][j];
            }
            maxInRows.add(maxInARow);
            maxInARow = Integer.MIN_VALUE;
        }
        int minAmongMax = Integer.MAX_VALUE;
        for(int i=0; i<maxInRows.size(); i++)
        {
            if(maxInRows.get(i) < minAmongMax)
                minAmongMax = maxInRows.get(i);
        }
        System.out.println(minAmongMax);
    }
}
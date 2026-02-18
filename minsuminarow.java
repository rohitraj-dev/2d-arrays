class minsuminarow
{
    public static void main(String[] args) 
    {
        int minSum = Integer.MAX_VALUE;
        int sum = 0;
        int row = 0;

        int arr[][] = {{6, 0, 2, 7, 6}, {1, 3, 7, 2, 2}, {9, 9, 4, 5, 2}}; 

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[0].length; j++)
            {
                sum = sum + arr[i][j];
            }
            if(sum < minSum)
            {
                minSum = sum;
                row = i;
            }

            sum = 0;
        }
        System.out.println(minSum);
        System.out.println(row);
    }
}
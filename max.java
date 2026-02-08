class max
{
    public static void main(String[] args) 
    {
        int max = 0;

        int arr[][] = {{6, 0, 2, 7, 6}, {1, 3, 7, 2, 2}, {9, 9, 4, 5, 2}};

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[0].length; j++)
            {
                if(arr[i][j] > max)
                    max = arr[i][j];
            }
        }
        System.out.println(max);
    }
}
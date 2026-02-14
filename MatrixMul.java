import java.util.*;
class MatrixMul
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a[][] = 
        {
            {1, 2},
            {3, 4}
        };
        int b[][] = 
        {
            {5, 6},
            {7, 8}
        };
        int n = a.length;
        int c[][] = new int[n][n];

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                for(int k=0; k<n; k++)
                {
                    c[i][j] += (a[i][j] * b[k][j]);
                }
            }
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            ans.add(new ArrayList<>());
            for(int j=0; j<n; j++)
            {
                ans.get(i).add(c[i][j]);
            }
        }
        //System.out.println(ans);

        // int n = a.length;
        // ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        // for(int i=0; i<n; i++)
        // {
        //     ans.add(new ArrayList<>());
        //     for(int j=0; j<n; j++)
        //     {
        //         int sum = 0;
        //         for(int k=0; k<n; k++)
        //         {
        //             sum += (a[i][k] * b[k][j]);
        //         }
        //         ans.get(i).add(sum);
        //     }
        // }
    }
}
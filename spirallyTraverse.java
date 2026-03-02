import java.util.*;
class spirallyTraverse
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int arr[][] = 
        {
            {1, 2, 3, 4, 5, 6},
            {7, 8, 9, 10, 11, 12},
            {13, 14, 15, 16, 17, 18},
            {19, 20, 21, 22, 23, 24},
            {25, 26, 27, 28, 29, 30}
        };

        ArrayList<Integer> ans = new ArrayList<>();
        int row = arr.length;
        int col = arr[0].length;

        int firstRow = 0;
        int lastRow = row - 1;
        int firstCol = 0;
        int lastCol = col - 1;
        while(firstRow<=lastRow && firstCol<=lastCol)
        {
            for(int j=firstCol; j<=lastCol; j++)
            {
                ans.add(arr[firstRow][j]);
            }
            firstRow++;
            if(firstRow>lastRow || firstCol>lastCol)
                break;

            for(int i=firstRow; i<=lastRow; i++)
            {
                ans.add(arr[i][lastCol]);
            }
            lastCol--;
            for(int j=lastCol; j>=firstCol; j--)
            {
                ans.add(arr[lastRow][j]);
            }
            lastRow--;
            if(firstRow>lastRow || firstCol>lastCol)
                break;

            for(int i=lastRow; i>=firstRow; i--)
            {
                ans.add(arr[i][firstCol]);
            }
            firstCol++;
        }
        System.out.println(ans);
    }
}
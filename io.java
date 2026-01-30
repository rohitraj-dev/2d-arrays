import java.util.*;
class io
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter row : ");
        int a =sc.nextInt();  // input of no. of rows

        System.out.print("enter column : ");
        int b =sc.nextInt(); // input of no. of columns

        int arr[][] = new int[a][b]; // initialising the matrix with no. of rows and no. of columns

        for(int i=0; i<a; i++) // runs for no. of rows
        {
            for(int j=0; j<b; j++) // runs for no. of columns
            {
                arr[i][j] = sc.nextInt(); // taking input at each position
            }
            //System.out.println();
        }
        for(int i=0; i<a; i++) // runs for no. of rows
        {
            for(int j=0; j<b; j++) // runs for no. of columns
            {
                System.out.print(arr[i][j]+" "); // printng in a row
            }
            System.out.println(); // changing row
        }
    }
}
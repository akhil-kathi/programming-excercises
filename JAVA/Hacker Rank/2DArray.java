import java.util.*;

class DArray
{
    public static void main(String args[])
    {
        int arr[][] = new int[6][6];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                arr[i][j]=sc.nextint();
            }
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.println(arr[i][j]+" "+arr[i][j+1]+arr[i][j+2]);
                System.out.println("     "+arr[i+1][j+1]);
                System.out.println(arr[i+2][j]+" "+arr[i+2][j+1]+arr[i+2][j+2]);
            }
        }
    }
}
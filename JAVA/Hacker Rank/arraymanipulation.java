import java.util.*;

class arraymanipulation
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int queries = sc.nextInt();
        int arr[] = new int [len];
        for(int l=1;l<=queries;l++)
        {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int value = sc.nextInt();
            for(int i=start-1;i<=end-1;i++)
            {
                arr[i]+=value;
            }
            /*for(int x: arr)
            {
                System.out.print(x+" ");
            }*/
        }
        int max = -1100000;
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
            max=(max<arr[i]?arr[i]:max);
        }   
        System.out.println();
        System.out.println(max);
    }
}
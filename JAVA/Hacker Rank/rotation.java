import java.util.*;

class rotation
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);   
        int arr[] = {1,2,3,4,5};
        int r = 4;
        int[] result = rotLeft(arr, r);
        for(int x:result)
        {
            System.out.print(x+" ");
        }
    }
    static int[] rotLeft(int arr[],int r)
    {
        /*int times = 1;
        for(;times<=r;r++)
        {
            int tmp = arr[0];
            for(int i=0;i<arr.length-1;i++)
            {
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=tmp;
        
        }*/
        ArrayList<Integer> tmp = new ArrayList<>();
        int I=0;
        int i=0;
        for(I=0;I<r;I++)
        {
            tmp.add(arr[I]);
        }
        for(i=0;I<arr.length;i++,I++)
        {
            arr[i]=arr[I];
        }
        for(int j=0;i<arr.length;i++,j++)
        {
            arr[i]=tmp.get(j);
        }
        return arr;
    }


}
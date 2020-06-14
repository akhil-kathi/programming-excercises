import java.util.*;

class chaiotic
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();   
        List<String> ans = new ArrayList<>(n);
        for (int i = 0; i < n; i++) 
        {
            int len = sc.nextInt();
            int arr [] = new int[len];
            for(int j=0;j<len;j++)
            {
                arr[j]=sc.nextInt();
            }asdadf
            ans.add(minimumBribes(arr));
        }
        for(String q : ans)
        {
            System.out.println(q);
        }
    }
    static String minimumBribes(int[] q) 
    {
        int count=0;
        for(int I=0;I<q.length;I++)
        for(int i=0;i<q.length-1;i++)
        {
            if(q[i]>i+1 && q[i]-(i+1)>2)
            {
                return "Too chaotic";
            }
            else
            {
                for(int j=i+1;j<q.length;j++)
                {
                    if(q[i]>q[j])
                    {
                        int tmp = q[i];
                        q[i]=q[j];
                        q[j]=tmp;
                        count ++;
                    }
                    else
                     break;
                }
            }
        }
           
        return String.valueOf(count);
    }
}
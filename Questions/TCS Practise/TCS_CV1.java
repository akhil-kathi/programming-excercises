import java.util.*;
import java.lang.Math;
class TCS_CV1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int len = sc.nextInt();
		sc.nextLine();
		String n = sc.nextLine();
		int arr[] = new int[len];
		int cnt=-1;
		for(String x : n.split(","))
		{
			arr[++cnt]=Integer.valueOf(x);
		}
		int base6[] = new int[len];
		for(int i=0;i<len;i++)
		{
			int num=0;
			for(int j=0;arr[i]!=0;arr[i]/=6,j++)
			{
				num += (int)Math.pow(10,j)*(arr[i]%6);
			}
			base6[i]=num;
			
		}
		int x=-1;
		int sum[] = new int [len];
		for(int num : base6)
		{
			int s=0;
			while(num!=0)
			{
				s=s+num%10;
				num=num/10;
			}
			sum[++x]=s;
		}
		System.out.println();
		int count=0;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(sum[i]>sum[j])
				{
					count++;
				}
			}

		}
		System.out.println(count);
	}
}
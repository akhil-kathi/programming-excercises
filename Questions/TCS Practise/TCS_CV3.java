import java.util.*;
class TCS_CV3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		String parms = sc.nextLine();
		String params[] = parms.split(" ");
		int len = Integer.valueOf(params[0]);
		int queries = Integer.valueOf(params[1]);
		int rocks [] = new int [len];
		for(int i=0,j=2;i<len;i++,j++)
		{
			rocks[i]=Integer.valueOf(params[j]);
		}
		Arrays.sort(rocks);
		int [][] min_max = new int [queries][2];
		int j=0;
		for(int i=len+2;i<params.length;i++,j++)
		{
			min_max[j][0]=Integer.valueOf(params[i]);
		 	min_max[j][1]=Integer.valueOf(params[++i]);
		}
		 for(int i=0;i<queries;i++)
		 {
		 	int count=0;
		 	int min = min_max[i][0];
		 	int max = min_max[i][1];
		 	for(int I=0;I<len;I++)
		 	{
		 		if(rocks[I]>=min && rocks[I]<=max)
		 		{
		 			count++;
		 		}
		 	}
		 	System.out.println(count);
		 }
	}
}
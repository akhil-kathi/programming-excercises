import java.util.*;

class TCS4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int size = sc.nextInt();
		//Map <String,Integer> mp = new HashMap<>(size);	
		String names [][] = new String [num][size];
		double marks [][] = new int [num][size];
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<size;j++)
			{
				names[i][j] = sc.nextLine();
				marks[i][j] = sc.nextDouble();
			}
		}
		int j=0;
		for(int i=0;i<size;i++)
		{
			int mx=-1;
			if(marks[i][j]>marks[i+1][j])
				mx=i;
		}
	}
}
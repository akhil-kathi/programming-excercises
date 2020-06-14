import java.util.*;
class TCS_CV4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		String input = sc.nextLine();
		String parms [] = input.split(" ");
		int qLen = Integer.valueOf(parms[0]);
		double inital [] = new double [qLen];
		double jump [] = new double [qLen];
		double nova [] = new double [qLen];
		int l=0;
		for (int q=0;q<qLen;q++)
		{
			inital[q]=Double.valueOf(parms[++l]);
			jump[q]=Double.valueOf(parms[++l]);
			nova[q]=Double.valueOf(parms[++l]);
		}
		for(int i=0;i<qLen;i++)
		{
			int count =1;
			double n=nova[i];
			double init = inital[i];
			double nva = nova[i];
			double jmp = jump[i];
			for(int I=0;init!=nva;I++)
			{
				init=init+jmp;
				
				if(nva<init)
				{
					nva = nva+ n;
					count++;
				}
			}
			System.out.print(count+" ");
		}
		System.out.println();
	}
}
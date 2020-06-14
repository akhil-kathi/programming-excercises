import java.util.*;
class charfreq
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		List <Character> chr = new ArrayList<Character>();
		for (int i=0;i<input.length();i++)
		{
			int len=1;
			chr.add(input.charAt(i));
			if(!chr.contains(input.charAt(i)))
			{
				for (int j=i+1;j<input.length();j++)
				{
					if (input.charAt(i)==(input.charAt(j)))
					{
						len++;
					}
				}
			}
			System.out.println(input.charAt(i)+" "+len);
		}	
	}
}
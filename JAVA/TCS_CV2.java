import java.util.*;
class TCS_CV2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		String nums = sc.nextLine();
		String n[] = nums.split(",");
		ArrayList<Integer> num = new ArrayList<Integer>();
		for(String x : n)
		{
			num.add(Integer.valueOf(x));
		}	
		Collections.sort(num);
		for(int x : num )
		{
			System.out.print(x+" ");
		}
		System.out.println();
		if(!num.contains(0)||!num.contains(2)||!num.contains(1)||!num.contains(3))
		{
			System.out.println("Impossible");
		}
		else
		{
			for(int i=0;i<num.size();i++)
			{
				List h <Integer> = new ArrayList<Integer>(num.subList(0,2));
				int maxh = Collections.max(Arrays.asList(num));
				if(!(max>2))
				{
					System.out.print(max);
				}
				else
				{
					max=h.get(0);
				}
				num.remove(num.indexOf(max));
				List hh <Integer> = new ArrayList<Integer>(num.subList(0,4));
				int maxhh = Collections.max(Arrays.asList(num));
				if()

			}
		}
		
	}
}
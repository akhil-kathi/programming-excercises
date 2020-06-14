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
	}
}
import java.util.*;
class TCS_CV5
{
	public static void main(String[] args) 
	{
		int pref[] = [1,4,9,16,25,36,49,64,81,100,121,144,169,196];
		String input = new Scanner(System.in).nextLine();
		int sum = Integer.valueOf(input[0]);
		int calSum=0;
		int i=0;
		int cnt=1;
		while(sum+pref[i]<=calSum&&cnt<=2)
		{
			sum=sum+pref[i];
			i++;
			cnt++;
		}
		if(cnt==2)
		{
			System.
		}
	}
}
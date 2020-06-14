import java.util.*;
import java.text.ParseException;  
import java.text.SimpleDateFormat;  
//import java.util.Date;  
import java.util.Locale; 
import java.text.*; 

class Date
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String d = sc.nextLine();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date date = null;
		try
		{
			date = dateFormat.parse(d);
			System.out.println(date);
		}
		catch (Exception e)
		{
			System.out.println("Exception Occured");
		}

	}
}
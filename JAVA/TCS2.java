//This is The Coding Area

import java.util.*;
import java.lang.*;
class TCS2
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner (System.in);
    String input = sc.next();
    int q = sc.nextInt();
    char []dir = new char [q];
    int []times = new int[q];
    for(int i=0;i<q;i++)
    {
      dir[q]=sc.next().charAt(0);
      times[q]=sc.nextInt();
    }
    StringBuilder tmp = new StringBuilder(input);
    StringBuilder res = new StringBuilder();
    for(int i=0;i<q;i++)
    {
      StringBuilder t1 = new StringBuilder();
      if(dir[i]=='R'||dir[i]=='r')
      {
        t1.append(tmp.substring(tmp.length()-times[i]-1,tmp.length()-1));
        t1.append(tmp.substring(0,tmp.length()-times[i]-2));          
      }
      else if(dir[i]=='L' || dir[i]=='l')
      {
        t1.append(tmp.substring(times[i]-1,tmp.length()-1));
        t1.append(tmp.substring(0,times[i]-2);)
      }
      res.append(t1.charAt(0));
      tmp = new StringBuilder();
      tmp.append(t1);
    }
    if(input.contains(res.toString()))
    {
         System.out.println("YES");
    }
    else
       {
         System.out.println("NO");
       }
  }
}

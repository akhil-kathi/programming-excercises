import java.util.*;
public class PallindromeSubSequence 
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      String input = "abba";
      //String input = sc.nextLine();
      int len = input.length();
      int [][] chk = new int[len][len];
      int i=0,j=0;
      for(i=0;i<len;i++)
      {
        chk[i][i]=1;        
      }
      for(i=len-2;i>=0;i--)
      {
        for(j=i+1;j<len;j++)
        {
          if(input.charAt(i)==input.charAt(j))
          {
            chk[i][j]=2+chk[i+1][j-1];
          }
          else
            chk[i][j]=(chk[i][j-1]>chk[i+1][j]?chk[i][j-1]:chk[i+1][j]);
        }
      }
      for(int I = 0;I<len;I++)
      {
        for(int J=0;J<len;J++)
        {
        System.out.print(chk[I][J]+" ");
        }
        System.out.println();
      }
      int func,maxi= 0;
      for(i =0;i<len-1;i++ )
      {
        func = chk[0][i]*chk[i+1][len-1];
        if(func>maxi)
        {
          maxi=func;
        }
      }
      System.out.println(maxi);
    }
}
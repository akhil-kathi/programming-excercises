import java.util.*;

class repeat
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        char [] chr = inp.toCharArray();
        ArrayList<Character> chars = new ArrayList<Character>();
        StringBuilder SC = new StringBuilder();
        for(char x : chr)
            chars.add(x);    
        for(int i=0;i<chars.size();i++)
        {
            char temp = chars.get(i);
            if(chars.get(i)==chars.get(i+1))
            {
                /*chars.remove(i);
                for(int j=i;j<chars.size();j++)
                {
                    if(temp==chars.get(j))
                        chars.remove(j);
                    else
                        break;    
                }*/
            }
            else
                SC.append(chars.get(i));
        }
        System.out.println(SC);
    }
    
}
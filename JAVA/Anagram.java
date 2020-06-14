import java.util.*;

class Anagram
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        ArrayList <String> subStr= new Anagram().substring(inp);
        for(String x : subStr)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        HashMap<Integer,ArrayList<String>> strLenSrt = new Anagram().stringVal(subStr,inp.length());
        Set set = strLenSrt.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) 
        {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("Length: "+ mentry.getKey() + " Substrings: ");
            System.out.print(mentry.getValue());
            System.out.println();
        }
            System.out.println();
    }
    static ArrayList<String> substring(String inp)
    {
        ArrayList <String> substring = new ArrayList<>();
        for(int i=0;i<inp.length();i++)
        {
            for(int j=i;j<inp.length();j++)
            {
                StringBuilder sb = new StringBuilder();
                for(int k=i;k<=j;k++)
                {
                    sb.append(inp.charAt(k));
                }
                substring.add(sb.toString());
            }
        }
        return substring;
        
    }
    static HashMap<Integer,ArrayList<String>> stringVal(ArrayList <String> str,int len)
    {
        HashMap <Integer,ArrayList<String> > strLenSort = new HashMap<Integer,ArrayList<String>>();
        for(int i=1;i<=len;i++)
        {
            ArrayList<String> strLen = new ArrayList<>();
            for(int j=0;j<str.size();j++)
            {
                if(str.get(j).length()==i)
                {
                    strLen.add(str.get(j));
                }
                strLenSort.put(i,strLen);
            }
        }
        return strLenSort;
    }
}
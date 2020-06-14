import java.util.*;
import java.lang.*;

class numertoword
{
    public static void main(String args[])
    {
        String inp = new Scanner(System.in).next();
        Map<Integer,String> numToWords = new HashMap<>();
        numToWords.put(1,"one");
        numToWords.put(2,"two");
        numToWords.put(3,"three");
        numToWords.put(4,"four");
        numToWords.put(5,"five");
        numToWords.put(6,"six");
        numToWords.put(7,"seven");
        numToWords.put(8,"eight");
        numToWords.put(9,"nine");
        numToWords.put(0,"zero");
        StringBuilder res = new StringBuilder();
        for(Character x : inp.toCharArray())
        {
            if(Character.isDigit(x))
                res.append(numToWords.get(Character.getNumericValue(x)));
            else
                res.append(x);    

        }
        System.out.println(res);
    }
}
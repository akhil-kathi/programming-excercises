import java.util.*;
class check
{
    public static void main(String[] args) {
        List <String> l = new ArrayList<>();
        l.add("50");
        l.add("Hello World");
        l.add("How are you?");
        l.remove("How are you?");
        for(String x : l)
            System.out.print(x+" ");  
        System.out.println(l.contains("50"));     
    }
}
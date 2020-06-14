interface P1
{
    int x =0;
    int add(int a,int b)
    {
        return a+b;
    }
}

class practise
{
    public static void main(String[] args) {
        P1 p = new P1();
        System.out.println("Created abstract class object");
    }
}
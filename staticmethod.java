public class staticmethod 
{
    int a,b;
    static int x;
    void m1()
    {
        System.out.println("m1 is non static method");
        a=100;
        b=200;
        x=300;
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        }
    static void m2()
    {
        x=100;
        System.out.println("m2 is static method");
    }
    static int add(int a,int b)
    {
        return a+b;
    }
    public static void main(String[]args)
    {
        staticmethod t =new staticmethod();
        t.m1();
        m2();
        int x=add(6,7);
        System.out.println(x);

    }
}

public class staticmethod2 
{
    {
        System.out.println("i am a block");
    }
    static
    {
        System.out.println("i am a static block"); //execute only one time
    }
    staticmethod2()
    {
        System.out.println("constructor");
    }
    public static void main(String[]args)
    {
        staticmethod2 s1=new staticmethod2();
        staticmethod2 s2=new staticmethod2();
        staticmethod2 s3=new staticmethod2();

    }
}

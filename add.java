public class add 
{
    int n1,n2,n3;
    boolean res;
    add()
    {
        n1=100;
        n2=200;
        n3=0;
        res=true;
        System.out.println("contructor called");
    }
    void sum()
    {
        n3=n1+n2;
        System.out.println(n3);
    }
    void display()
    {
        System.out.println("method called");
    }
    public static void main(String[]args)
    {
        System.out.println("hiii");
        add a=new add();
        System.out.println(a.res);
        System.out.println(a.n1);
        System.out.println(a.n2);
        a.display();
        a.sum();
        add a1=new add();
    }
}

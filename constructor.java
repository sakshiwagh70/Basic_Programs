public class constructor 
{
    constructor()
    {
        System.out.println("contructor called");
    }
    void display()
    {
        System.out.println("inside display method");
    }
    public static void main(String[]args)
    {
        System.out.println("hiii");
        constructor c=new constructor();
        c.display();
        constructor c1=new constructor();
        c.display();
        constructor c2=new constructor();
    }
}

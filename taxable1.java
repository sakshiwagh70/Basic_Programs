public class taxable1
 {
    int trate =10;
    public void caltax()
    {

    }
}
class publication
{
    String pubname;
    public publication (String name)
    {
        pubname=name;
    }
}
 class book extends publication implements taxable1
{
    int bid ,price;
    public book(int id,int pr,String name)
    {
        super(name);
        bid=id;
        price=pr;
    }
    public void caltax()
    {
        price =price+price*10/100;
       System.out.println("book id"+bid);
       System.out.println("book price"+price);
       System.out.println("book pubname"+pubname);

    }
    public static void main(String[]args)
    {
        book b1= new book(1,200,"tech");
        b1.caltax();
    }
}
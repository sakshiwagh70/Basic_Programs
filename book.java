interface taxable 
{
    int trate=10;
    public void caltax();
}
public class book implements taxable
{
    int bid,price;
    public book(int id,int pr)
    {
        bid =id;
        price=pr;
    }
    public void caltax()
    {
        price=price+price*10/100;
        System.out.println("book id"+bid);
        System.out.println("book price"+price);

    }
    public static void main(String[]args)
    {
        book b1=new book(1,200);
        b1.caltax();
    }
}

public class chair 
{
    public void display()
   {
      System.out.println("display chair");
   }
}
class wheelchair extends chair
{
    public void display()
    {
        super.display();
        System.out.println("display wheelchair");
    }

    public static void main(String[]args)
    {
        wheelchair w=new wheelchair();
        w.display();
    }
}


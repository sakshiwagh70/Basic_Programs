public class furniture 
{
    int height,width;
    String col;
    public furniture(int h, int w, String c)
    {
        height=h;
        width=w;
        col=c;
    }
    public void display()
    {
        System.out.println("height"+height);
        System.out.println("width"+width);
        System.out.println("color"+col);
    }
}
 class chair extends furniture
{
    int legs;
    public chair(int h,int w, String c, int n)
    {
      super(h,w,c);
      legs =n;
    }
    public void display()
    {
        super.display();
        System.out.println("legs :"+legs);
    }

    public static void main(String[]args)
    {
    chair c =new chair(10,20,"blue",4);
    c.display();
    }
}
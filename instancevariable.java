public class instancevariable
 {
    int bid;
    String bname;
    void book()
    {
        bid=100;
        bname="java";
        System.out.println(bid+ "\n"+bname);
    }
    public static void main(String[] args) 
    {
        instancevariable vr=new instancevariable();
        vr.bid=101;
        vr.bname="c++";
        System.out.println(vr.bid);
        System.out.println(vr.bname);
        vr.book();
    }
}

public class emp 
{
      int id;
      String empname;
    void display(int id,String empname)
    {
        this.id=id;
        this.empname=empname;
    }
    void accept()
    {
        System.out.println(id+ " "+empname);
    }
    public static void main(String[]args)
    {
        emp s=new emp();
        s.id=100;
        s.empname="sakshi";
        System.out.println(s.id);
        System.out.println(s.empname);
        s.display(101,"mohini");
        s.accept();
    }
}

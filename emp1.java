public class emp1 
{
    int eid;
    String ename;
    emp1()
    {
        eid=100;
        ename="sakshi";
        System.out.println("default contructor");
    }
    void accept(int eid, String ename)
    {
        this.eid=eid;
        this.ename=ename;
        System.out.println("parameterized contructor");
        System.out.println(eid);
        System.out.println(ename);
    }
    void display()
    {
        System.out.println(eid);
        System.out.println(ename);
    }
    public static void main(String[]args)
    {
        emp1 e=new emp1();
        e.display();
        e.accept(101,"mohini");
    }
}

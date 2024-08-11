public class staticvariable 
{
    int sid;
    String name;
    static String course="java";
    static String college="zeal";
    void display()
    {
        System.out.println(sid+ " "+course+ " "+name+ " "+college);
    }
    public static void main(String[]args)
    {
        System.out.println(course);
        System.out.println(college);
        staticvariable s1= new staticvariable();
        s1.sid=100;
        s1.name="sakshi";
        staticvariable s2= new staticvariable();
        s2.sid=200;
        s2.name="mohini";
        s1.display();
        s2.display();
    }

}

public class staticmethod1 
{
    static String course;
    int roll;
    static
    {
       System.out.println("inside a static block");
       course="full stack java";
    }
    staticmethod1()
    {
        System.out.println("inside a constructor");
    }
    void display()
    {
        System.out.println(course);
    }
    public static void main(String[]args)
    {
        System.out.println(course);
        staticmethod1 st=new staticmethod1();
        st.display();
    }
}

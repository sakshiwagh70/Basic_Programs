public class newkeyword
 {
    int rollno;
    String name;
    String place;
    void attend()
    {
        System.out.println("exam");
    }
    void course()
{
    System.out.println("java");
}
    public static void main(String[]args)
    {
        newkeyword st=new newkeyword();
        st.rollno=23;
        st.name="sakshi";
        st.place="pune";
        System.out.println(st.rollno);
        System.out.println(st.name);
        System.out.println(st.place);
       st.attend();
       st.course();



    }
}

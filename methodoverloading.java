public class methodoverloading
 {
    void area(float r)
    {
        float area=3.14f * r * r;
        System.out.println("area of circle:"+area);
    }
    void area(float l, float b)
    {
        float area=l*b;
        System.out.println("area of rectangle:"+area);
    }
    public static void main(String[]args)
    {
        methodoverloading m=new methodoverloading();
        m.area(2.3f);
        m.area(2.4f,5.6f);
    }
}

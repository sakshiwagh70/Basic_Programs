package maxpack;
public class maxclass
 {
    int n1,n2;
    public maxclass(int n1,int n2)
    {
        this.n1=n1;
        this.n2=n2;
    }
    public int findmax()
    {
        if(n1>n2)
        return n1;
        else
        return n2;
    }
}

public class Call_By_Ref {
    public static class var{

        int a=10;
        int b=20;
    }
    public int disp(var v) //Call by reference
    {
        v.a=v.a+1;
        return v.a;
    }
    public int disp(int b) //Call by value
    {
        b=b+1;
        return b;
    }
    public static void main(String[] args)
    {
        Call_By_Ref c=new Call_By_Ref();
        var v=new var();
        System.out.println(v.a+" "+v.b);
        System.out.println("Call by ref :"+c.disp(v)+" "+"Call by value :"+c.disp(v.b));
        System.out.println("Call by ref value of a changed :"+v.a+" "+"Call by value b not changed :"+v.b);

    }
}

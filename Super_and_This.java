class Super_class {
    int a = 10;
   public int multiply()
   {
       return this.a*this.a;//access same class variable
   }
    public void display() {
        System.out.println(this.multiply());//access same class method
    }
}
    public class Super_and_This extends Super_class{
        public void show()
        {
            System.out.println(super.a);//access super class variable
            super.display();//access super class method
        }
        public static void main(String [] args)
        {
            Super_and_This s=new Super_and_This();
            s.show();
    }
}

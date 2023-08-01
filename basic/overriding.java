package arun.basic;

class Super{
    public void display(){
        System.out.println ("Super display");
    }
}
class sub extends Super {
    @Override
   public void display(){
       System.out.println ("Sub display");
    }

}

public class overriding {
    public static void main(String[] args) {
        sub s= new sub ();
        s.display ();
        Super a=new sub();
        a.display ();
        Super b=new Super();
        b.display();
        /* IT IS CALLED RUNTIME POLYMORPHISM
        * WHERE IT IS DECIDED BASED ON THE RUNTIME NOT BY THE COMPILER WHEREAS IN OVERLOADING IT IS
        * DECIDED BY COMPILEr */
    }

}

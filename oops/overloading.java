package arun.oops;

class test{
    public int max (int a,int b){
        return a>b?a:b;
    }
    public int max(int a,int b,int c){
        final int i = a > b && a > c ? a : b > c ? b : c;
        return i;
    }
}
public class overloading {
    public static void main(String[] args) {
        test a=new test();
        int b=a.max(1,3);
        System.out.println (b);
    }

}

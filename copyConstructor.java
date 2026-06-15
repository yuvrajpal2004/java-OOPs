package Contructor1;

class D{
    int a; String b;
    D(){
        a=12; b="yuvi";

    }
    D(D ref){
        a=ref.a;
        b=ref.b;
        System.out.println(a+" "+b);
    }
}
public class copyConstructor {
    public static void main(String[] args) {
        D r=new D();
        D r2= new D(r);
    }
}

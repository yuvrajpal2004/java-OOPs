package Contructor1;

class C{
    int a; String b;
    C(int x,String y){
        a=x;
        b=y;
        System.out.println(a+" "+b);
    }
}
public class parameterizedContructor {

    public static void main(String[] args) {
        C ref=new C(12,"Ambuj");
    }
}

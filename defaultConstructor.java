package Contructor1;

class A{
    int a; String b ; boolean c;
//    A(){
//
//    }
    void dis(){
        System.out.println(a+" "+b+" "+c);
    }

}

public class defaultConstructor {
    public static void main(String[] args) {
        A r= new A();
        r.dis();

    }
}

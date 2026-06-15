package Contructor1;

class Overloading{
    Overloading(){
        System.out.println("hello");
    }

    Overloading(int x){
        System.out.println("hello" +x);
    }
    Overloading(int x, int y){
        System.out.println("hello"+x+" "+y);
    }
}
public class constructorOverLoading {
    public static void main(String[] args) {
        Overloading ref=new Overloading(2,5);
        Overloading r=new Overloading(4);
    }

}

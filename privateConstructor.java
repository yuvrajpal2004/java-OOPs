package Contructor1;

 class privateConstructor {

     private privateConstructor(){
         System.out.println("private constructor is the constructor thar is not accessible form" +
                 "outside the class  .");
     }

     public static void main(String[] args) {
         privateConstructor r= new privateConstructor();

     }
}

package inheritance;

class Human2 {
    void eat(){
        System.out.println("Eating...");
    }
}
class Man2 extends Human2{
    void sit(){
        System.out.println("Sitting under the tree");
    }
}
class Woman1 extends Human2{
    void stand(){
        System.out.println("Standing infront of the river");
    }
     public static void main(String args[]){
         Woman1 w1=new Woman1();
         w1.stand();
         w1.eat();
         Man2 m2=new Man2();
         m2.sit();
         m2.eat();
     }
}

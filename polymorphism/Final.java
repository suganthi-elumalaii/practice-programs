package inheritance.abstraction.encapsulation.polymorphism;
class Car{
    final String color="Black";
    final void run(){
        System.out.println("Running safely..");
        System.out.println("Color of tha Car: "+color);
    }
}
class Bmw extends Car{
    String colors="White";
    void runn(){
        System.out.println("Running smooth");
    }
}
public class Final {
    public static void main(String args[]){
        Car b=new Car();
        b.run();
     }
}

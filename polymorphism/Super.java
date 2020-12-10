package inheritance.abstraction.encapsulation.polymorphism;
class Sea{
    String color;
    void live(){
        System.out.println("Fishes are living in the Sea");
    }
    Sea(String color){
        this.color=color;
        System.out.println("Fish color is "+color);
    }
}
class Fish extends Sea{
    String color="Blue";
    void live(){
        super.live();
        System.out.println("Fish will die without water");
    }
    Fish(){
        super("Yellow");
        System.out.println("Sea color is " +color);
    }
}
public class Super {
    public static void main(String args[]){
    Fish f=new Fish();
    f.live();
    }
}

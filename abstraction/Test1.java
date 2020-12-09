package inheritance.abstraction;

interface Displayable{
    void show();
    void display();
    void work();
}
abstract class School implements Displayable{
abstract void look();
    public void work(){
        System.out.println("Home work is completed");
    }
}
 class Abstraction extends School {
    public void show(){
        System.out.println("showing..");
    }
    public void display(){
        System.out.println("displaying");
    }
    public void look(){
        System.out.println("looking");
    }
}
public class Test1{
 public static void main(String[] args) {
   Abstraction a=new Abstraction();
   a.show();
   a.display();
   a.look();
   a.work();  
 }   
}

package inheritance.abstraction.encapsulation.polymorphism;
class Plants{
    void grow()
    {
        System.out.println("Plants are growing...");    
    }
}
class Branch extends Plants{
    void grow()
    {
        System.out.println("Plants are growing rapidly..");
    }
}
public class MethodOverriding {
    public static void main(String args[]){
        Branch b=new Branch();
        b.grow();
    }
}

package inheritance.abstraction.encapsulation.polymorphism;
interface Printable{}
class Printer implements Printable{
    public void print(){
        System.out.println("Printer is used to print the paper");
    }
}
class Scannerr implements Printable{
    public void scan(){
        System.out.println("Scanner is used to scan the documents");
    }
} 
class Call{
    void invoke(Printable p){
        if(p instanceof Printer){
            Printer pr=(Printer)p;
            pr.print();
        }
        if(p instanceof Scannerr){
            Scannerr sc=(Scannerr)p;
            sc.scan();
        }
    }
}

public class InstanceOf {
    public static void main(String args[]){
        Printable p=new Scannerr();
        Call c=new Call();
        c.invoke(p);

    }
    
}

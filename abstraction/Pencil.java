package inheritance.abstraction;
interface Drawable{
    void draw();
}
interface Writable{
    void write();
    void draw();
}
public class Pencil implements Drawable,Writable {
   public void draw(){
        System.out.println("Pencil is used to draw");
    }
    public void write(){
        System.out.println("Pencil is used to write");
    }
    public static void main(String args[]){
        Pencil p1=new Pencil();
        p1.draw();
        p1.write();
    }

    
}

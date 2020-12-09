package inheritance;

class Human1 {
    void write(){
        System.out.println("Super class");
    }    
}
class Man1 extends Human1{
    void run(){
        System.out.println("Sub Class of Human1 and Super Class of Woman");
    }
}
class Woman extends Man1{
    void work(){
        System.out.println("Sub Class");
    }
    public static void main(String args[]){
        Woman w=new Woman();
        w.work();
        w.run();
        w.write();
    }
}
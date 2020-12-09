package inheritance;
class Address{
    String city, state;
   public Address(String city, String state){
        this.city=city;
        this.state=state;
    }
}
class Student{
    int id;
    String name;
    Address a;
   public Student(int id, String name, Address a){
        this.id=id;
        this.name=name;
        this.a=a;
    }
    public void display(){
        System.out.println(id+" "+name);
        System.out.println(a.city+" "+a.state);
    }
}
 class Aggregation {
    public static void main(String args[]){
        Address a1=new Address("Chennai", "TamilNadu");
        Address a2=new Address("chennai", "Tamilnadu");
        Student stud=new Student(90,"Suganthi",a1);
        Student stud1=new Student(95,"Surya",a2);
        stud.display();
        stud1.display();
    }
    
}

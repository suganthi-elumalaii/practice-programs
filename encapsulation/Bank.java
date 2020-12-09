package inheritance.abstraction.encapsulation;
class Client{
    private String name;
    private int accNo;
    private int age;
    public String getName(){
        return name;
    }
    public int getAccNo(){
        return accNo;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAccNo(int accNo){
        this.accNo=accNo;
    }
    public void setAge(int age){
        this.age=age;
    }
}
public class Bank {
    public static void main(String args[]){
     Client c =new Client();
     c.setName("Surya S");
     c.setAccNo(2531999);
     c.setAge(21);
     System.out.println("NAME: "+c.getName()+"\nACCOUNT NUMBER: "+c.getAccNo()+"\nAGE: "+c.getAge());
    }
    
}

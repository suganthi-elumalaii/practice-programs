import java.util.*;    
class Employees {    
int id;    
String name,dob;    
int age,salary;    
public Employees(int id, String name, String dob, int age, int salary) {    
    this.id = id;    
    this.name = name;    
    this.dob = dob ;    
    this.age = age;    
    this.salary = salary;    
}    
}    
public class EmployeeMap {    
public static void main(String[] args) {    
    
    Map<Integer,Employees> map=new LinkedHashMap<Integer,Employees>();    

    Employees e1=new Employees(101,"Surya S","Mar25",21,30000);    
    Employees e2=new Employees(122,"Suganthi E","Aug3",21,50000);    
    Employees e3=new Employees(133,"Sudha S","Jul4",22,40000);
    Employees e4=new Employees(116,"Akshith I","Jul22",19,35000);
    Employees e5=new Employees(125,"Sushma S","Sep14",26,60000);
    Employees e6=new Employees(176,"Mohan E","Aug6",23,40000);
    Employees e7=new Employees(187,"Sumeth S","Apr30",25,45000);
    Employees e8=new Employees(138,"Vasanth E","Feb21",20,30000);
    Employees e9=new Employees(119,"Selvarani E","Aug6",38,60000);
    Employees e10=new Employees(210,"Pramela S","Jan15",40,65000);
    Employees e11=new Employees(211,"Subramanian N","Jun30",57,100000);
    Employees e12=new Employees(112,"Iyyapan B","Nov12",33,90000);
    Employees e13=new Employees(213,"Swetha M","Nov30",22,30000);
    Employees e14=new Employees(114,"Archana R","Jul14",22,20000);
    Employees e15=new Employees(215,"Punitha A","Oct30",23,40000);
    Employees e16=new Employees(126,"Ramya B","Mar17",24,40000);
    Employees e17=new Employees(137,"Pavithra R","Jun2",22,70000);
    Employees e18=new Employees(148,"Praveen G","Jul18",25,30000);
    Employees e19=new Employees(159,"Sajeeth M","Sep9",21,20000);
    Employees e20=new Employees(210,"Aishwarya M","Aug11",28,60000);
      
    map.put(1,e1);  
    map.put(2,e2);  
    map.put(3,e3);
    map.put(4,e4); 
    map.put(5,e5);  
    map.put(6,e6);  
    map.put(7,e7);  
    map.put(8,e8);  
    map.put(9,e9);  
    map.put(10,e10);  
    map.put(11,e11);  
    map.put(12,e12);  
    map.put(13,e13);  
    map.put(14,e14);
    map.put(15,e15);  
    map.put(16,e16);  
    map.put(17,e17);  
    map.put(18,e18);  
    map.put(19,e19);  
    map.put(20,e20);  
 
    for(Map.Entry<Integer, Employees> entry:map.entrySet()){    
        int key=entry.getKey();  
        Employees emp=entry.getValue();  
        System.out.println(key+" Details:");  
        System.out.println(" Employee Id: "+emp.id+"\n Name: "+emp.name+"\n DOB: "+emp.dob+"\n Age: "+emp.age+"\n Salary: "+emp.salary);   
    } 
    // removing 20
    map.remove(20);
    System.out.println("\nUpdated Details: \n");
    for(Map.Entry<Integer, Employees> entry:map.entrySet()){    
        int key=entry.getKey();  
        Employees emp=entry.getValue();  
        System.out.println(key+" Details:");  
        System.out.println(" Employee Id: "+emp.id+"\n Name: "+emp.name+"\n DOB: "+emp.dob+"\n Age: "+emp.age+"\n Salary: "+emp.salary);   
    } 
    // adding new employee detail as 21
    Employees e21=new Employees(135,"Aathreya S","Oct17",19,30000);
    map.put(21,e21);
    System.out.println("\nUpdated Details: \n");
   for(Map.Entry<Integer, Employees> entry:map.entrySet()){    
        int key=entry.getKey();  
        Employees emp=entry.getValue(); 
        System.out.println(key+" Details:");  
        System.out.println(" Employee Id: "+emp.id+"\n Name: "+emp.name+"\n DOB: "+emp.dob+"\n Age: "+emp.age+"\n Salary: "+emp.salary);   
    } 
    //update the name Archana as Saiarchana
    Employees e22=new Employees(114,"SaiArchana R","Jul14",22,20000);
    map.put(14,e22);
    System.out.println("\nUpdated Details: \n");
    for(Map.Entry<Integer, Employees> entry:map.entrySet()){    
        int key=entry.getKey();  
        Employees emp=entry.getValue(); 
        System.out.println(key+" Details:");  
        System.out.println(" Employee Id: "+emp.id+"\n Name: "+emp.name+"\n DOB: "+emp.dob+"\n Age: "+emp.age+"\n Salary: "+emp.salary);   
    } 
   
    
}    
}    

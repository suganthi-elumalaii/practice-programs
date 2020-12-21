import java.util.*;
class StudentData
{
    String record;
    String name;
    int age;
    String dob;

    StudentData(String record, String name, int age,String dob){
        this.record=record;
        this.name=name;
        this.age=age;
        this.dob=dob;
    }
    public String getRecord(){
        return record;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getDob(){
        return dob;
    }
    public static void main(String[] args) 
    {
        LinkedList<StudentData> list=new LinkedList<StudentData>();
        list.add(new StudentData("Record 1","Surya S",21,"25Mar"));
        list.add(new StudentData("Record 2","Suganthi E",21,"3Aug"));
        list.add(new StudentData("Record 3","Akshith I",19,"22Jul"));
        list.add(new StudentData("Record 4","Sudha S", 22,"4Jul"));

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter record number to display: ");
        String record=scanner.nextLine();
        for(StudentData data:list){
            if(data.getRecord().equals(record)){
            System.out.println("Record: "+data.getRecord()+"\nName: "+data.getName()+"\nAge: "+data.getAge()+"\nDOB: "+data.getDob());
            }
            
        }
        scanner.close();
        
    }
}


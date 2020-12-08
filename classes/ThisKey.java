public class ThisKey {
    int rollno;
    String name;
    String college;
    ThisKey(int rollno, String name, String college){
        this.rollno=rollno;
        this.name=name;
        this.college=college;
    }
    void show(){
        System.out.println("Rollno: "+rollno+"\nName: "+name+"\nCollege Name: "+college);
    }
    public static void main(String args[]){
        ThisKey tk=new ThisKey(95, "Surya S", "AIHT");
        tk.show();
    }

    
}

public class Static {
    int id;
    String name;
    static String company="full";
    Static(int n,String d){
        id=n;
        name=d;
    }
    void display(){
        System.out.println(id+" "+name+" "+company);
    }
    public static void main(String args[]){
        Static stat=new Static(90,"minkie");
        stat.display();
    }
    
}

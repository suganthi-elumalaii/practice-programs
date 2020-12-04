public class NestedIf {
    public static void main(String args[]){
        int age=21;
        if(age>=14)
        {
            if(age<18)
                System.out.println("minor but not a child labour");
            else
            System.out.println("major");
        }
        else
        System.out.println("Child labour");
    }
    
}

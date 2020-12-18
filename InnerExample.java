public class InnerExample {
    void display(){
    class Inner{
        int number=5;
        void call(){
        System.out.println("NUMBER: "+number);
        }
       
    }
    Inner obj=new Inner();
    obj.call();// I used to call the inner class method to access inner class member from outer class method

    }
    public static void main(String args[]){
        InnerExample inner=new InnerExample();
        inner.display();
    }

    

    
}

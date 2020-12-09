package inheritance;
 class Human {
    void read(){
        System.out.println("Super Class");
    }
}
 class Man extends Human{
    void sleep(){
        System.out.println("Sub Class");
    }
    public static void main(String args[]){
        Man m=new Man();
        m.sleep();
        m.read();
    }
}

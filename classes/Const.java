class Const {
    int num1;
    String name;
Const()
    {
        num1=5;
        System.out.println("in default Constructor");
    }
    Const(int n)
    {
        num1=n;
        System.out.println("In Parameterized Constructor");
    }
    Const(int n, String s)
    {
        num1=n;
        name=s;
    }
    public static void main(String args[]){
        Const con1=new Const(10);
        Const con2=new Const();
        Const con3=new Const(3,"sugarya");
        System.out.println(con1.num1);
        System.out.println(con2.num1);
        System.out.println(con3.num1+" "+con3.name);
    }
}
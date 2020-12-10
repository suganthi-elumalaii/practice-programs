package inheritance.abstraction.encapsulation.polymorphism;
class Operation{
    int mul(int a,int b){
        return a*b;
    }
    int mul(int a,int b,int c)
{
    return a*b*c;
}
int mul(int a,int b,int c,int d){
    return a*b*c*d;
}
}
class MethodOverloading{
    public static void main(String args[]){
        Operation m=new Operation();
        System.out.println(m.mul(2,3));
        System.out.println(m.mul(3,4,6));
        System.out.println(m.mul(7,4,8,5));
    }
}
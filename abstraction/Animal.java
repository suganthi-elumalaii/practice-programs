package inheritance.abstraction;

abstract class Animal {
    abstract void eat();
    }
    class Dog extends Animal{
        void eat(){
            System.out.println("Eating....");
        }
        public static void main(String args[]){
            Animal d=new Dog();
            d.eat();
        }
    }

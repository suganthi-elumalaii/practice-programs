package inheritance.abstraction;
interface Readable {
    void read();
    void write();
    void listen();
    }
    class Person implements Readable{
       public void read(){
            System.out.println("Reading...");
        }
       public void write(){
            System.out.println("Writing...");
        }
       public void listen(){
            System.out.println("Listening..");
        }
        public static void main(String args[]){
            Readable p=new Person();
            p.read();
            p.write();
            p.listen();
        }
    }

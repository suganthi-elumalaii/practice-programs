public class Lloop {
    public static void main(String args[]){
        first:
        for(int i=0; i<=4; i++)
        {
            for(int j=0; j<=4; j++)
            {
                if(i==2 && j==2){
                    break first;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}

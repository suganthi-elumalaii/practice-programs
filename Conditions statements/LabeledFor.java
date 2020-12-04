public class LabeledFor {
    public static void main(String args[]){
        first:
        for(int i=0; i<=4; i++)
        {
         second:
            for(int j=0; j<=4; j++)
            {
                if(i==3 && j==3){
                    break first;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}

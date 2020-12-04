public class Continue {
    public static void main(String args[])
    {
        for(int k=0; k<=10; k++)
        {
            if(k==1||k==3||k==5||k==7||k==9)
            continue;
            System.out.println("EVEN:"+k);
        }
    }
}

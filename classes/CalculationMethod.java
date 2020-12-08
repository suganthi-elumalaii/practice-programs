public class CalculationMethod {
    int num1, num2, result;
    public void perform()
    {
        result=num1+num2;
    }
}
class Addition{
    public static void main(String args[]){
        CalculationMethod calc=new CalculationMethod();
        calc.num1=3;
        calc.num2=5;
        calc.perform();
        System.out.println("Addition:"+calc.result);
    }
}

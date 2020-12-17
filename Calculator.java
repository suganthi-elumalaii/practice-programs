import java.util.Scanner;

public class Calculator {
     public static void main(String[] args) {
      int first, second, result, option;
      char choice;
    Scanner scanner = new Scanner(System.in);
    do{
    System.out.print("Enter two numbers: ");
    first = scanner.nextInt();
    second = scanner.nextInt();

    System.out.print("Enter an option (1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Modulo Division): ");
    option = scanner.nextInt();

    switch (option) {
      case 1:
        System.out.println("ADDITION");
        result = first + second;
        System.out.println(first+ " + " +second+ " = " +result);
        break;

      case 2:
        System.out.println("SUBTRACTION");
        result = first - second;
        System.out.println(first+ " - " +second+ " = " +result);
        break;

      case 3:
        System.out.println("MULTIPLICATION");
        result = first * second;
        System.out.println(first+ " * " +second+ " = " +result);
        break;

      case 4:
        System.out.println("DIVISION");
        result = first / second;
        System.out.println(first+ " / " +second+ " = " +result);
        break;

      case 5:
        System.out.println("REMAINDER");
        result= first % second;
        System.out.println(first+ " % " +second+ " = " +result);
        break;

      default:
        System.out.printf("Error! option is not correct");
    }
    System.out.println("Do you want to quit? Y/N");
    choice = scanner.next().charAt(0);
    }while((choice== 'y')||(choice== 'Y'));

    scanner.close();
  }
  

}


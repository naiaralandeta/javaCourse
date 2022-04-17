import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean check = false;
        String operation;
        double num1;
        double num2;

        do{
            check = true;
            System.out.println("\n Select the operation. Options are: +, -, /, *");
            operation = sc.nextLine();

            System.out.println("\n Please, insert the first number:");
            num1 = Double.parseDouble(sc.nextLine());

            System.out.println("\n Please, insert the second :");
            num2 = Double.parseDouble(sc.nextLine());

            switch(operation){
                case "+":
                    // Addition
                    System.out.println("Addition");
                    Addition sum = new Addition(num1, num2);
                    sum.showResult();
                    break;
                case "-":
                    // Subtraction
                    System.out.println("Subtraction");
                    Subtraction sub = new Subtraction(num1, num2);
                    sub.showResult();
                    break;
                case "*":
                    // Multiplication
                    System.out.println("Multiplication");
                    Multiplication mul = new Multiplication(num1, num2);
                    mul.showResult();
                    break;
                case "/":
                    // Division
                    System.out.println("Division");
                    Division div = new Division(num1, num2);
                    div.showResult();
                    break;
            }

        } while(check != true);

    }

}

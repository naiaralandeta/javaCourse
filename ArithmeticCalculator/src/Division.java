public class Division extends Operation{

    public Division(double num1, double num2){
        super(num1, num2, '/', num1 / num2);
        if (num2 == 0){
            System.out.println("Error: Can't divide by zero");
        }
    }

}

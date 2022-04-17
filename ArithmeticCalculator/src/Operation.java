public class Operation {

    double num1;
    double num2;
    double total;
    char type;

    public Operation(double num1, double num2, char type, double total){
        this.num1 = num1;
        this.num2 = num2;
        this.type = type;
        this.total = total;
    }

    public void showResult(){
        System.out.println(this.num1 + " " + this.type + " " + this.num2 + " = " + this.total + "\n");
    }

}

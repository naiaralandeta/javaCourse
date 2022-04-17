import java.util.ArrayList;
import java.util.Scanner;

public class Validation {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Boolean present = false;
        ArrayList<Employee> emailList = new ArrayList<Employee>();

        emailList.add(new Employee(1,"Mark","mark@mail.com"));
        emailList.add(new Employee(2, "Lauren","lauren@mail.com"));
        emailList.add(new Employee(3, "Adam","adam@mail.com"));
        emailList.add(new Employee(4, "Lisa","lisa@mail.com"));

        System.out.println("Which ID would you like to search? ");
        String emailID = sc.nextLine();

        for (Employee employee : emailList) {
            if(employee.email.contains(emailID)){
                present = true;
                break;
            }
        }

        if(present){
            System.out.println("The email " + emailID + " is present in the list");
        } else {
            System.out.println("The email " + emailID + " is NOT present in the list");
        }

    }

}

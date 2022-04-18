import java.io.*;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args){
        try {
            File file = new File("file.txt");
            file.createNewFile();
            if (file.exists()) {

                Boolean cont;
                Scanner sc = new Scanner(System.in);

                do {
                    System.out.println("Write the action to do it? (r to read or w to write)");
                    String action = sc.nextLine();

                    switch (action) {
                        case "r":
                            Scanner reader = new Scanner(file);
                            while (reader.hasNextLine()) {
                                String data = reader.nextLine();
                                System.out.println(data);
                            }
                            reader.close();
                            break;
                        case "w":
                            FileWriter writer = new FileWriter(file, true);
                            System.out.println("Write:");
                            writer.write(sc.nextLine());
                            writer.write('\n');
                            writer.close();
                            System.out.println("Successfully wrote to the file.");
                            break;
                    }
                    System.out.println("Do you want to do another actions: y or n?");
                    if(sc.nextLine().equals("y")){
                       cont = true;
                    } else {
                        cont = false;
                    }
                } while(cont);
            } else {
                System.out.println("File NOT exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

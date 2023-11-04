import java.util.Scanner;

public class CalculationClass {

    boolean programStatus = true;
    Scanner Sc = new Scanner(System.in);
public void program(){
        do {
            System.out.println("Choose what operation you want to perform:");
            System.out.println("");
            System.out.println("A. Convert from any system to the decimal system");
            System.out.println("B. Convert from decimal system to another system");
            System.out.println("C. Summing up numbers from different systems");
            System.out.println("D. Subtracting numbers from different systems");
            System.out.println("E. Multipying numbers from different systems");
            System.out.println("F. Dividing numbers from different systems");
            System.out.println("");
            System.out.println("W. Exit the program");


        }while (programStatus == true);

    }
    public void BinarySystemDecider(){

    }
    public void getUserInput(){
        char userInput = (char)Sc.nextByte();
        if (userInput == 'A'){
            System.out.print("Please enter binary system number");

        }
}

}

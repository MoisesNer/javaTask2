import java.util.Scanner;

public class CalculateTips{

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        double charge, tip;

        System.out.print("Please enter your bill: ");

        charge = input.nextDouble();
        tip = (charge * .15);

        double total = (charge + tip);

        System.out.println("Gratuity is equal to $" + tip + " your total is $" + total);

    }
}
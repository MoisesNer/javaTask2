import java.util.Scanner;

public class VolumeCilinder{

    public static void main(String [] args){
        // setting a constant value for pi
        final double pi = 3.14159;

        //initialize a new Scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter a Radius: ");
        //take in that input
        double radius = input.nextDouble();
        double base = (radius * radius * pi);

        System.out.print("Enter length: ");
        double length = input.nextDouble();

        System.out.println("The volume of your cylinder is " + (base * length));
    }
}
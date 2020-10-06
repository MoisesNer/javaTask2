import java.util.Scanner;

public class Celcius2Fahrenheit {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        float cel;
        
        System.out.print("Please enter Celcius: ");

        cel = input.nextFloat();

        float far = (((cel / 5)*9)+32);

        System.out.println("Equal to " + far + " F");
    }
}
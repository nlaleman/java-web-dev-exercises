package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter miles driven: ");
        double miles = input.nextDouble();
        System.out.println("Please enter gallons of gas used: ");
        double gallons = input.nextDouble();
        input.close();

        double mpg = miles / gallons;
        System.out.println("Your mileage is " + mpg + "miles per gallon.");

    }

}

package exercises;

import java.util.Scanner;

public class Square {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a length for your rectangle: ");
        double length = input.nextDouble();
        System.out.println("Please enter a width for your rectangle: ");
        double width = input.nextDouble();
        input.close();

        double area = length * width;
        System.out.println("The area of your rectangle is " + area);

    }
}

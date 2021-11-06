package exercise4;

import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double number = -9999;
        int size = input.nextInt();
        double[] numbers = new double[size];

        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
            if (numbers[index] > number){
              number = numbers[index];
            }
        }
        System.out.println("Max number: " + number);
    }
}  

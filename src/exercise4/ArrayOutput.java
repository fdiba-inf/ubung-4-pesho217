package exercise4;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class ArrayOutput {
  public static void main(String []args){
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the size of arrays: ");
  int size = input.nextInt();
  int[] numbers = new int[size];

  for (int i = 0;i < numbers.length; i++ ) {
    numbers[i] = input.nextInt();
  }
  for (int i = 0;i < numbers.length;i++) {
    for (int j = 0;j < i;j++){
      System.out.print(" ");
      }
       System.out.println(numbers[i]);
    }
  }
}

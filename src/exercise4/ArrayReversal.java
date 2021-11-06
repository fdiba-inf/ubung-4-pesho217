package exercise4;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayReversal {
  public static void main(String []args) {

    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    char array[] = new char[size];
    char rev[] = new char[size];
    int j = 0;

    for(int i = 0;i < size;i++) {
      array[i] = input.next().charAt(0);
    }
    for(int i = size - 1;i >= 0;i--) {
    rev[j] = array[i];
      j++;

    }
    String str = Arrays.toString(rev);
        System.out.println("Reversed symbols: " + str);
  }
}
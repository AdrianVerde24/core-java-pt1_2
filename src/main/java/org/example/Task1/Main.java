package org.example.Task1;
import java.util.Scanner;  /* Import the Scanner class*/


public class Main {
    public <intArray> boolean checkSort(int arraySize, int[] arr){
        int[] intArray = new int [arraySize];
        for (int i=0; i < intArray.length - 1; i++){
            if (intArray[i] > intArray[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scInteger = new Scanner(System.in);  // Create a Scanner object
        int arraySize= 0;
        System.out.println("Enter First number- ");
        arraySize = scInteger.nextInt();  // Read first input

        int[] intArray = new int[arraySize];

        Scanner scArray = new Scanner(System.in);  // Create a second Scanner object
        System.out.println("Enter Integers for Array- ");
        for(int i=0; i<arraySize; i++){
            intArray[i] = scArray.nextInt();  // Read second  input
        }
        System.out.println(" The answer is" + new Main().checkSort(arraySize,intArray));
    }
}

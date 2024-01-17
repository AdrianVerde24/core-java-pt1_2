package org.example.Task1;
import java.util.Scanner;  /* Import the Scanner class*/


public class Main {
    public <intArray> boolean checkSort(int arraySize, intArray[] arr){
        String[] intArray = new String[arraySize];
        for (int i=0; i < intArray.length - 1; i++){
            int firstInt = Integer.parseInt(intArray[i]);
            int secondInt= Integer.parseInt(intArray[i+1]);
            if (firstInt > secondInt){
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

        String[] intArray; //

        Scanner scArray = new Scanner(System.in);  // Create a second Scanner object
        System.out.println("Enter Integers for Array- ");
        intArray = (scArray.nextLine()).split(" ",0);  // Read second  input
        System.out.println(" The answer is" + new Main().checkSort(arraySize,intArray));
    }
}

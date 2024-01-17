package org.example.Task2;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Main {
    public static String reverseString1(String inputString) {
        String fString1 = "";
        StringBuilder revString1 = new StringBuilder();
        // append a string into StringBuilder object revString1
        revString1.append(inputString);
        // reverse StringBuilder
        revString1.reverse();
        fString1 = revString1.toString();
        // print reversed String revString1
        return fString1;
    }

    public static String reverseString2(String inputString) {
        String fString1 = "";
        // getBytes() method to convert string
        // into bytes[].
        byte[] strAsBytearray = inputString.getBytes();

        byte[] result = new byte[strAsBytearray.length];

        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsBytearray.length; i++)
            result[i] = strAsBytearray[strAsBytearray.length - i - 1];

        fString1 = new String(result);
        return fString1;
    }

    public static String reverseString3(String inputString) {
        String fString1 = "";
        // convert String to character array
        // by using toCharArray
        char[] inputArray = inputString.toCharArray();

        for (int i = inputArray.length - 1; i >= 0; i--) {
            fString1 = fString1 + inputArray[i];
        }
        return fString1;
    }
    public static void main (String[]args){

        Scanner scString = new Scanner(System.in);  // Create a Scanner object
        String revString = "";
        System.out.println("Enter String -  ");
        revString = scString.nextLine();// Read String;
        System.out.println(reverseString1(revString)); // Reverse string output using String Builder
        System.out.println(reverseString2(revString)); // Reverse string output but reversing Bytes in an Array
        System.out.println(reverseString3(revString)); // Reverse string output by converting string to char Array
    }
}
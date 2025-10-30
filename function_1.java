// Java Program to show 
// Basic method calling
import java.io.*;
import java.math.*;
import java.util.*;

class function_1 {
    public static void main(String[] args) {
        // Before calling the fun method
        System.out.println("Before Call");

        // Calling the fun method
        fun();

        // After calling the fun method
        System.out.println("After Call");
    }

    // fun method to print a simple message
    public static void fun() {
        // Printing message inside fun method
        System.out.println("Inside Fun");
    }
}
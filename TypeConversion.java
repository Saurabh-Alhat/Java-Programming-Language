import java.util.*;

public class TypeConversion {
    public static void main(String args[]) {
        // int a = 25;
        // long b = a;                      // 'Type Conversion' or 'Widening Conversion' or 'Implicit Conversion'
        // System.out.println(b);

        // long a = 25;
        // int b = a;                       // Lossy Conversion: conversion from 'long' to 'int' is not allowed in Java
        // System.out.println(b);

        Scanner sc = new Scanner(System.in);

        // int number = sc.nextFloat();     // Lossy Conversion: conversion from 'float' to 'int' is not allowed in Java

        float number = sc.nextInt();
        System.out.println(number);
    }
}
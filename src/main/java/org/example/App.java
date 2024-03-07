package org.example;

import java.util.Scanner;

public class App
{
    public static int addme(int a, int b) {return a+b;}
    public static int subtractme(int a, int b) {return a-b;}

    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt(); // Read the first number from user

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt(); // Read the second number from user

        System.out.println("Addition procedure: " + addme(num1,num2));
        System.out.println("Substruction procedure: " + subtractme(num1, num2));
    }
}

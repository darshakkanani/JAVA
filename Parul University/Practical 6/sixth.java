// 6. The Fibonacci sequence is defined by the following rule. The first 2 values in the sequence are 1, 1. Every subsequent value 
// is the sum of the 2 values preceding it. Write a Java program that uses both recursive and non- recursive functions to print 
// the nth value of the Fibonacci sequence? 

import java.util.*;

public class sixth 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");

        int x = sc.nextInt();

        int a = 1;
        int b = 1;
        int temp = 0;

        System.out.print(a+" "+b+" ");
        for(int i = 1; i <= x-2;i++)
        {
            temp = a+b;
            System.out.print(temp+" ");
            a = b;
            b = temp;
        }
    }
}

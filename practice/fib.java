// Aim:- The Fibonacci sequence is defined by the following rule. The first
// 2 values in the sequence are 1, 1. Every subsequent value is the sum of
// the 2 values preceding it. Write a Java program that uses both recursive
// and non- recursive functions to print the nth value of the Fibonacci
// sequence?

import java.util.*;

class Fibonacci{
    public void nonRecFib(int n){
        int a = 1;
        int b = 1;
        System.out.print(a+ " " + b + " ");
        for(int i = 3; i <= n; i++)
        {
            int temp = a + b;
            System.out.print(temp + " ");
            a = b;
            b = temp;
        }
    }
    public int recFib(int n){

        if(n <= 1){
            return n;
        }
        return recFib(n-1) + recFib(n-2);
    }
    
}
public class fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        Fibonacci fibo = new Fibonacci();


        int ans = fibo.recFib(n);
        System.out.println("Recursive Fibonacci: " + ans);
        System.out.print("Non-recursive Fibonacci: " );
        fibo.nonRecFib(n);
        sc.close();
    }
    
}

package com.classproblem;

import java.util.Scanner;

public class ClassPracticeProblem {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = reader.nextInt();

        if(number % 2 == 0)
            System.out.println(number + " is even");
        else
            System.out.println(number + " is odd");
    }
}

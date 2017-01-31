package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);

        boolean letterGrade = true;
        byte grade;

        while (letterGrade) {
            System.out.println("Welcome to the Letter Grade Converter!");
            System.out.println();

            System.out.print("Enter a numerical grade: ");
            grade = scan1.nextByte();

            if (grade >= 88 && grade <= 100) {
                System.out.println("Letter Grade: A");

            } else if (grade >= 80 && grade <= 87) {
                System.out.println("Letter Grade: B");

            } else if (grade >= 67 && grade <= 79) {
                System.out.println("Letter Grade: C");

            } else if (grade >= 60 && grade <= 66) {
                System.out.println("Letter Grade: D");

            } else if (grade >= 0 && grade <= 60) {
                System.out.println("Letter Grade: F");

            }

            System.out.println();

            System.out.print("Continue? (y/n): ");
            char yN = scan1.next().charAt(0);

            System.out.println();

            if (yN == 'y') {
                letterGrade = true;
            } else {
                letterGrade = false;
                System.out.println("Bye!");

            }
        }
    }
}



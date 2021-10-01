package com.perscholas.java_basics;

public class Main {

    public static void main(String[] args) {
	/*
	Write a program that uses a for-loop to loop
	through the numbers 1-10 and prints out each number.
	*/
        for (int x = 1; x <= 10; x++) {
            System.out.print(x + " ");
        }
        System.out.println(" ");
    /*
	Write a program that uses a while loop to loop through
	the numbers 0-100 in increments of 10 and prints out each number.
	*/
        int q = 0;

        while (q < 100 && q >= 0) {
            q+=10;
            System.out.print(q + " ");
        }
        System.out.println(" ");
    /*
	Write a program that uses a do-while-loop to loop
	through the numbers 1-10 and prints out each number.
	*/
        int w = 0;
        do {
            w++;
            System.out.print(w + " ");
        } while(w >= 0 && w < 10);
        System.out.println(" ");
    /*
	Write a program that uses a for-loop to loop through
	the numbers 1-100. Print out each number if is a multiple
	 of 5, but do not print out any numbers between 25 and 75.
	 Use the “continue” statement to accomplish this.
	*/
        for(int e = 1; e < 100; e++){
            e += 4;
            if (e > 25 && e < 75) {
                continue;
            }
            System.out.print(e + " ");
        }
        System.out.println(" ");
    /*
	Write a program that uses a for-loop to loop through the numbers 1-100.
	Print out each number if is a multiple of 5, but do not print out any numbers
	greater than 50. Use the “break” keyword to accomplish this.
	*/
        for(int x = 1; x < 100; x++){
            x += 4;
            if (x > 50) {
                break;
            }
            System.out.print(x + " ");
        }
        System.out.println(" ");
    /*
	Write a program that uses nested for-loops to output the following:
    Week 1: Day 1 Day 2 Day 3 Day 4 Day 5
    Week 2: Day 1 Day 2 Day 3 Day 4 Day 5
	*/
        String weekOne = "Week 1: ";
        String weekTwo = "Week 2: ";
        if (weekOne != null) {
            System.out.print(weekOne + "");
            for(int x = 1; x <= 5; x++){
                    System.out.print("Day " + x + " ");
                }
            System.out.println(" ");

            System.out.print(weekTwo + "");
            for(int x = 1; x <= 5; x++){
                System.out.print("Day " + x + " ");
            }
            System.out.println(" ");
        }
    /*
    Write a program that nests a for-loop inside another.
    Print out the inner and outer variable (e.g., i or j)
    in the inner loop (e.g., System.out.println("Inner loop:
    i: " + i + ", j: " + j);).
    */
        for(int i = 0; i <= 1; i+= 2){
            int x = 10;
            int y = 5;

            for (int z = 0; z <= 1; z+= 2){
                int a = 20;
                int b = 15;
                System.out.println("Outer loop: y: " + y + ", x: " + x);
                System.out.println("Inner loop: b: " + b + ", a: " + a);
            }
        }

    }//end main
}//end class

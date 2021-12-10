////////////////////////////////////////////////////////////////////////////////////

// Garrett Wiese

// Doug Lundin

// CSC 160 Computer Science I

// September 19th, 2021

// Homework 4 - Programming Exercise 4.15 (Page 154) Phone Pad

////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter:");

        String letter = input.nextLine();

        letter = letter.toLowerCase();

        if (letter .equals("a") || letter .equals("b") || letter .equals("c")) {

            System.out.println("The corresponding number is 2");

        } else if (letter .equals("d") || letter .equals("e") || letter .equals("f")) {

            System.out.println("The corresponding number is 3");

        } else if (letter .equals("g") || letter .equals ("h") || letter .equals("i")) {

            System.out.println("The corresponding number is 4");

        } else if (letter .equals("j") || letter .equals("k") || letter .equals("l")) {

            System.out.println("The corresponding number is 5");

        } else if (letter .equals("m") || letter .equals("n") || letter .equals("o")) {

            System.out.println("The corresponding number is 6");

        } else if (letter .equals("p") || letter .equals("q") || letter .equals ("r") ||
                letter .equals("s")) {

            System.out.println("The corresponding number is 7");

        } else if (letter .equals("t") || letter .equals("u") || letter .equals("v")) {

            System.out.println("The corresponding number is 8");

        } else if (letter .equals("w") || letter .equals("x") || letter .equals("y") ||
                letter .equals("z")) {

            System.out.println("The corresponding number is 9");

        } else {

            System.out.println(letter + " is an invalid input");

            input.close();
        }
    }
}

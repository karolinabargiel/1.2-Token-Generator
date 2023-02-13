package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userInput;
        boolean correctValue = false;
        do {
            System.out.println("Welcome in token generator. Choose length of token - available values: 5, 10, 15): ");
            Scanner scan = new Scanner(System.in);
            try {
                userInput = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid format");
                continue;
            }
            TokenLength tokenLength;
            try {
                tokenLength = TokenLength.getTokenByLength(userInput);
            } catch (IllegalArgumentException e) {
                System.out.println("Wrong value. Available values: 5, 10, 15");
                continue;
            }
            System.out.println(TokenGenerator.tokenGenerator(tokenLength));
            correctValue = true;

        } while (!correctValue);
    }
}
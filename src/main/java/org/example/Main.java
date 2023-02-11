package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userInput = 0;
        do {
            System.out.println("Welcome in token generator. Choose length of token - available values: 5, 10, 15): ");
            Scanner scan = new Scanner(System.in);
            try {
                userInput = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid format");
            }
            switch (userInput) {
                case 5 -> System.out.println(TokenGenerator.tokenGenerator(TokenLength.FIVE));
                case 10 -> System.out.println(TokenGenerator.tokenGenerator(TokenLength.TEN));
                case 15 -> System.out.println(TokenGenerator.tokenGenerator(TokenLength.FIFTEEN));
                default -> System.out.println("Available values: 5, 10, 15");
            }
        } while (userInput != 5 && userInput != 10 && userInput != 15);
    }
}
package Inlämningsuppgifter;
import java.util.*;
import java.util.Scanner;

public class assignmentOneMain {
    public static void main(String[] args) {

        assignmentOneLogic logic = new assignmentOneLogic();
        Scanner scan = new Scanner(System.in);
        boolean continual = true;
        while (continual) {
            System.out.println("\n---------------------------------");
            System.out.println("Welcome to the MorseCode Program \nPress 1: to enter Text to Morse \nPress 2: to enter Morse to Text");
            System.out.println("_________________________________");
            try {
                String menu = scan.nextLine();
                if (menu.equals("1")) {
                    System.out.println("You have entered TEXT to Morse Converter ");
                    System.out.println("Please type a letter or a text to get the morsecode.");
                    String text = scan.nextLine().toLowerCase();
                    System.out.print(text.toUpperCase() +" = " + logic.TextToMorse(text));
                } else if (menu.equals("2")) {
                    System.out.println("You entered for MORSE to Text Converter ");
                    System.out.println("Please type the morsecode to get the letter.");
                    String text = scan.nextLine();
                    System.out.println(text + " = " + logic.MorseToText(text).toUpperCase());
                } else {
                    continual = false;
                    System.out.println("You need to enter either 1 or 2.");
                    String quit = "Quitting The Program";
                    Thread.sleep(500);
                    System.out.print(".");
                    Thread.sleep(500);
                    System.out.print(".");
                    Thread.sleep(500);
                    System.out.print(".");
                    Thread.sleep(500);
                    for (int i = 0; i < quit.length(); i++) {
                        System.out.print(quit.charAt(i));
                        Thread.sleep(200);
                    }
                }
            } catch (NoSuchElementException | InterruptedException e) {
                System.out.println("Invalid input. No such command is allowed!!!!! Program Shutdown");
                break;
            }
        }
    }
}


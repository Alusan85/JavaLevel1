/*
 * Java. Level 1. Lesson 3
 *
 * @author Kirill Kovalev
 * @version dated Aug 16, 2018
 *
 */

import java.io.*;
import java.util.*;

public class HomeWork3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            Random r = new Random();
            int number = r.nextInt(10);
            int guessNumber;
            int repeat;
            System.out.println("Guess the number!");

            for (int i = 1; i <= 3; i++) {
                try {
                    guessNumber = Integer.parseInt(br.readLine());

                }
                catch (NumberFormatException ex) {
                    System.out.println("Input Mismatch Exception!");
                    break;
                }
                
                if (guessNumber == number) {
                    System.out.println(guessNumber + " = " + number + " You win!");
                    break;
                }
                else {
                    if (guessNumber > number) System.out.println(guessNumber + " > ?");
                    else System.out.println(guessNumber + " < ?");
                }

                if (i == 3) System.out.println("You lost!");
            }

            System.out.println("Repeat the game? [1 - yes / 0 - no]: ");

            try { repeat = Integer.parseInt(br.readLine());


            while ((repeat < 0) || (repeat > 1)) {
                System.out.println("Enter correct number: [1 - yes / 0 - no]");
                repeat = Integer.parseInt(br.readLine());
            }
            }
            catch (NumberFormatException ex) {
                System.out.println("Input Mismatch Exception!");
                break;
            }
            if (repeat == 1) {
                System.out.println("Starting new game...");
            }
            else {
                System.out.println("Bye ...");
                return;
            }
        } while (true);
    }
}
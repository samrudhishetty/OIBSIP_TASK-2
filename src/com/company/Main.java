package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int rand = 1 + (int)(100 * Math.random());
            int guess,tries = 5;
            System.out.println("Number is  between 1-100. You have 5 tries to guess the number, So Good Luck!!");

            for (int i = 0; i < tries; i++) {
                System.out.print("Guess the number:");
                guess = scanner.nextInt();

                if (rand > guess  ) {
                    if (i == tries-1) {
                        System.out.println("Better Try Next Time. You ran out of tries. Game Over !! .");
                        System.out.println("The Guess number was " + rand );
                        break;
                    }
                    System.out.println("Try a number greater than " + guess);
                }
                else if (rand < guess ) {
                    if (i == tries-1) {
                        System.out.println("Better Try Next Time. You have ran out of tries. Game Over.");
                        System.out.println("The number was " + rand );
                        break;
                    }
                    System.out.println("Try a number smaller than " + guess);
                }else {
                    System.out.println("Congratulations! You successfully guessed the number.");
                    System.out.println("Your score is " + (tries-i)*10);
                    break;
                }
            }
        }
    }

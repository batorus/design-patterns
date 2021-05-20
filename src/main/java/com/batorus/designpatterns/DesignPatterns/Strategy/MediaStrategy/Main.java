package com.batorus.designpatterns.DesignPatterns.Strategy.MediaStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader _input = new BufferedReader(new InputStreamReader(System.in));
    public static final int menuStars = 65;

    public static void main(String[] args) {

        printWelcome();
        boolean quit = false;

        while (!quit) {
            try {
                int choice = printMenu();
                SocialMediaContext context = new SocialMediaContext();

                switch (choice) {
                    case 1:
                        // Setting Facebook strategy.
                        context.setSocialmediaStrategy(new FacebookStrategy());
                        context.connect("Loki");
                        break;
                    case 2:
                        context.setSocialmediaStrategy(new InstagramStrategy());
                        context.connect("Odin");
                        break;
                    case 3:
                        context.setSocialmediaStrategy(new TwitterStrategy());
                        context.connect("Arcturus");
                        break;
                    case 4:
                        context.setSocialmediaStrategy(new YoutubeStrategy());
                        context.connect("Borknagar");
                        break;
                    case 99:
                    default:
                        quit = true;
                }
            } catch (Exception ex) {
                System.out.println("Error: please try again..." + ex.getMessage());
            }
        }

        printCompleted();
    }


    public static void stars(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }

    
    public static void printWelcome() {
        stars(menuStars);
        System.out.println("Welcome to the Strategy Design Pattern Manager!");
    }

    public static void printCompleted() {
        stars(menuStars);
        System.out.println("Thank you for using the Manager");
        stars(menuStars);
    }

    public static int printMenu() throws IOException {
        stars(menuStars);
        System.out.println("Choose a strategy!");
        System.out.println("(1 - Facebook | 2 - Instagram | 3-Twitter | 4 - Youtube");
        System.out.println("Enter 99 to quit");
        stars(menuStars);
        return Integer.parseInt(_input.readLine());
    }
}
package com.batorus.designpatterns.DesignPatterns.Facade.Report;

import DesignPatterns.Strategy.MediaStrategy.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final BufferedReader _input = new BufferedReader(new InputStreamReader(System.in));
    public static final int menuStars = 65;

    public static void main(String[] args) throws Exception {
        //ReportGeneratorFacade reportGeneratorFacade = new ReportGeneratorFacade();

//        ReportGeneratorFacade.generateReport(ReportType.HTML, new DataSource(), null);
//
//        ReportGeneratorFacade.generateReport(ReportType.PDF, new DataSource(), null);

        printWelcome();
        boolean quit = false;

        while (!quit) {
            try {
                int choice = printMenu();
                SocialMediaContext context = new SocialMediaContext();

                switch (choice) {
                    case 1:
                        ReportGeneratorFacade.generateReport(ReportType.PDF, new DataSource(), null);
                        break;
                    case 2:
                        ReportGeneratorFacade.generateReport(ReportType.HTML, new DataSource(), null);
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
        System.out.println("(1 - generate PDF report | 2 - generate HTML report");
        System.out.println("Enter 99 to quit");
        stars(menuStars);
        return Integer.parseInt(_input.readLine());
    }
}
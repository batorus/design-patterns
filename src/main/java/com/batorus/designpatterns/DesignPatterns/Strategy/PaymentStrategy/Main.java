package com.batorus.designpatterns.DesignPatterns.Strategy.PaymentStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader _input = new BufferedReader(new InputStreamReader(System.in));
    public static final int menuStars = 65;

    public static void main(String[] args) {

        printWelcome();
        boolean quit = false;
        ShoppingCart cart = new ShoppingCart();
        String answer;
        while (!quit) {
            try {
                //this is the context that receives a strategy
                System.out.println("Do you want to buy an Item? [y/n]");
                answer = _input.readLine();

                if (answer.equals("y") || answer.equals("Y")) {

                    System.out.println("What is the type of item?");
                    String itemType = _input.readLine();

                    System.out.println("What is the upc code?");
                    String upcCode = _input.readLine();

                    System.out.println("What is the price?");
                    int price = Integer.parseInt(_input.readLine());

                    Item item = new Item(itemType, upcCode, price);
                    cart.addItem(item);
                    cart.viewItems();

                    System.out.println("Buy more items [y/n/q]");
                    answer = _input.readLine();

                    if (answer.equals("n") || answer.equals("N")) {

                        int choice = printPaymentOptionsMenu();

                        switch (choice) {
                            case 1:
                                System.out.println("Buy with cash.");
                                cart.pay(new CashStrategy());
                                break;

                            case 2:
                                boolean flag = false;
                                System.out.println("Buy with credit card.");
                                while (!flag) {
                                    System.out.println("Enter The PIN?");
                                    String PIN = _input.readLine();

                                    if (!PIN.equals("")) {
                                        cart.pay(new CreditCardStrategy(PIN));
                                        flag = true;
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("Buy with Paypal.");
                                boolean pplflag = false;

                                while (!pplflag) {
                                    System.out.println("Enter The Email?");
                                    String email = _input.readLine();

                                    System.out.println("Enter The Password?");
                                    String password = _input.readLine();

                                    if (!email.equals("") && !password.equals("")) {
                                        cart.pay(new PaypalStrategy(email, password));
                                        pplflag = true;
                                    }
                                }
                                break;

                            case 99:
                                quit = true;
                                break;
                            default:
                                System.out.println("Choose a valid option!");
                                break;
                        }
                    } else if (answer.equals("q")) {
                        quit = true;
                    }
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
        System.out.println("Welcome to the PaymentStrategy Design Pattern Manager!");
    }

    public static void printCompleted() {
        stars(menuStars);
        System.out.println("Thank you for using the Manager");
        stars(menuStars);
    }

    public static int printPaymentOptionsMenu() throws IOException {
        stars(menuStars);
        System.out.println("Choose a payment option!");
        System.out.println("(1 - Cash | 2 - Credit Card | 3 - Paypal");
        System.out.println("Enter 99 to quit");
        stars(menuStars);
        return Integer.parseInt(_input.readLine());
    }
}

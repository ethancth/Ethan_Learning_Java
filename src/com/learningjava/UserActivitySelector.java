package com.learningjava;

import java.util.Scanner;

/**
 * Created on 11/04/2022.
 */
public class UserActivitySelector {
    /*public static void main(String[] args) {
        System.out.print("Please, enter action name: ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        if ("login".equals(userInput)) {
            System.out.println("Please, enter your username");
        }
        else if ("sign_up".equals(userInput)) {
            System.out.println("welcome!");
        }
        else if ("terminate_program".equals(userInput)) {
            System.out.println("Thank you! Good bye!");
        }
        else if ("main_menu".equals(userInput)) {
            System.out.println("Main Menu");
        }
        else if ("about_app".equals(userInput)) {
            System.out.println("This app is created by me with support of IT-Bulls.com");
        }else{
            System.out.println("Please, enter one of these values: login, sign_up, terminate_program, main_menu, about_app");
        }

    }*/

    public static void main(String[] args) {
        System.out.print("Please, enter action name: ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        switch (userInput) {
            case "login":
                System.out.println("Please, enter your username");
                break;
            case "sign_up":
                System.out.println("Welcome!");
                break;
            case "terminate_program":
                System.out.println("Thank you! Good bye!");
                break;
            case "main_menu":
                System.out.println("Main menu");
                break;
            case "about_app":
                System.out.println("This app is created by me with "
                        + "support of \u00AEIT-Bulls.com");
                break;
            default:
                System.out.println("Please, enter one of these values: login, "
                        + "sign_up, terminate_program, main_menu, about_app");
                break;
        }

    }
}

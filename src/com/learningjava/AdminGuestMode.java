package com.learningjava;

import java.lang.String;
/**
 * Created on 10/04/2022.
 */
public class AdminGuestMode {
    public static void main(String[] args) {
        //String inputArguments = dString.join(",", args);
        String inputArguments = "string;";
        String adminFlag = "--admin";
        String guestFlag = "--guest";
        if (inputArguments.contains(adminFlag) && inputArguments.contains(guestFlag)) {
            System.out.println("Please, select either 'ADMIN' or "
                    + "'GUEST' mode for this program");
        } else if (inputArguments.contains(adminFlag)) {
            System.out.println("Hello, Admin!");
        } else if (inputArguments.contains(guestFlag)) {
            System.out.println("Hello, Guest!");
        }

    }
}

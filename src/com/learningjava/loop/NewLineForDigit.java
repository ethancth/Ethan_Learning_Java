package com.learningjava.loop;

import java.util.Scanner;

/**
 * Created on 11/04/2022.
 */
public class NewLineForDigit {
    public static void main(String[] args) {
        System.out.print("Please, enter any integer: ");
        Scanner sc = new Scanner(System.in);
        String intString = sc.next();
        for (char digit : intString.toCharArray()) {
            System.out.println(digit);
        }
    }
}

package com.learningjava;

import java.util.Scanner;
import java.lang.Math;
public class ArraysDemo {

    public static void main(String[] args) {
        int a,b,c;
        double s,triangleArea;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter A side of a triangle: ");
         a = sc.nextInt();

        System.out.print("Please, enter B side of a triangle: ");
         b = sc.nextInt();

        System.out.print("Please, enter C side of a triangle: ");
         c = sc.nextInt();
        if(a+b>c&&b+c>a&&a+c>b)
        {
            s=(a+b+c)/2;
             triangleArea=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Triangle area is: " + triangleArea);
        }else{
            System.out.println("NaN");
        }

    }

}

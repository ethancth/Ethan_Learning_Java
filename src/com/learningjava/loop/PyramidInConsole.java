package com.learningjava.loop;

import java.util.Scanner;

/**
 * Created on 11/04/2022.
 */
public class PyramidInConsole {

    public static void main(String[] args) {
        System.out.print("Please, enter height of the pyramid: ");
        Scanner sc = new Scanner(System.in);
        int intString = sc.nextInt();
        for(int i =1; i <= intString; i++){

            for(int j =0; j<i;j++){
                System.out.print('*');
            }
            System.out.println("");
        }

        for(int x =intString-1; x >= 1; x--){

            for(int y =0; y<x;y++){
                System.out.print('*');
            }
            System.out.println("");
        }
    }
}

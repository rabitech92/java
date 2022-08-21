
package com.java.core.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class New_MaxMinNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr []=new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter you value : ");
            arr[i]=input.nextInt();
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]) {
                    int term;
                term =arr[i];
                arr[i]=arr[j];
                arr[j]=term;
                }
            }
        }
        
        System.out.println("Max Number : " +arr[2]);
        System.out.println("Min Number : "+ arr[0]);
        
        
       System.out.println();
  }
    
    
}

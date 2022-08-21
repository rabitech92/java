
package com.java.core.model;

public class NewArr {
    public static void main(String[] args) {
        
        int arr [][] = {{1,99,91,11,44},{0,10,9,9,11},{3,23,21,5,20},{13,4,45,66,33},{11,0,1,20,56}};
        
        int temp = 0;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = j+1; k < arr[i].length; k++) {
                    if (arr[i][j]>arr[i][k]) {
                        temp = arr[i][k];
                        arr[i][k] = arr[i][j];
                        arr[i][j] = temp;
                    }
                }
                System.out.print(" " + arr[i][j]);
            }
            System.out.println(" ");
    }
    
    }
}
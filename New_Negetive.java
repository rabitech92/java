
package com.java.core.model;

import java.util.Scanner;


public class New_Negetive {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.print("Enter a Number : ");
        for (int i = 0; ; i++) {
            
            int val=sc.nextInt();
            if(val<=0){
            break;
            }
            else{
            
            sum=sum+val;
            
            }
            
            
        }
        System.out.println(" = "+sum);
        
    }
    
}

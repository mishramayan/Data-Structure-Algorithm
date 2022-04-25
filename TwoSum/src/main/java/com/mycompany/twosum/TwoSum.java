/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.twosum;

import java.util.Scanner;

/**
 *
 * @author mayanmishra
 */
public class TwoSum {
    
     public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");
        int n;
        
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        
        int[] array = new int[n]; 
        
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }
        
        System.out.println("Calling function...");
        
        printTwoSum(array, 10);
    }
    
    
    public static int[] printTwoSum(int[] array, int targetSum){
        
        System.out.println("In the function...");
        
        int L = 0;
        int R = array.length-1;
        
        
        for(int i=0; i<array.length; i++){
            int sum = array[L] + array[R];
            if(sum == targetSum){
                System.out.println(array[L] + " " + array[R]);
                return new int[] {array[L], array[R]}; 
            }
            else if(sum < targetSum){
                L++;
            }
            else{
                R--;
            }
        }
        
        return new int[0]; 
    }
    
}

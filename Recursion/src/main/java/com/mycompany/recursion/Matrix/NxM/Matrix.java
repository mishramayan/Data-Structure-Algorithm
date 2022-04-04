/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recursion.Matrix.NxM;

/**
 *
 * @author mayanmishra
 */
public class Matrix {
    public static void main(String[] args) {
        claculatePaths(3, 3);
    }
    
    public static int claculatePaths(int n, int m){
                        
        if(n == 1 || m == 1){
            System.out.println(1);
            return 1;
        }
        
        int ways = claculatePaths(n-1, m) + claculatePaths(n, m-1);
        
        System.out.println(ways);
        return ways;
    }

}

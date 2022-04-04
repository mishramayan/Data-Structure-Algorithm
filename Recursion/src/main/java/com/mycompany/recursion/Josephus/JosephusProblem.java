/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recursion.Josephus;

/**
 *
 * @author mayanmishra
 */
public class JosephusProblem {
    public static void main(String[] args) {
        findWinner(5, 3);
    }
    
    public static int findWinner(int n, int m){
                        
        if(n == 1){
            System.out.println(0);
            return 0;
        }
        
        int ways = (findWinner(n-1, m)+m)%n;
        
        System.out.println(ways);
        return ways;
    }

}

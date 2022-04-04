/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mayanmishra
 */
public class Recursion_power {
    public static void main(String[] args) {
        claculatePower(3, 4);
    }
    
    public static int claculatePower(int a, int b){
                        
        if(b==0){
            return 1;
        }
        
        a = a * claculatePower(a, b-1);
        System.out.println(a);
    return a;
    }
}

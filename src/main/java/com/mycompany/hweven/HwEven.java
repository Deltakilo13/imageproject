/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hweven;

/**
 *
 * @author dkuzm
 */
public class HwEven {
    public static void main(String arg[]){
    int n=100; //Should initialize until 100 but only goes to 98
    for (int i=0;i<n;i++)
        if(i%2==0) // will print numbers if even
            System.out.println(i);
    
}
}

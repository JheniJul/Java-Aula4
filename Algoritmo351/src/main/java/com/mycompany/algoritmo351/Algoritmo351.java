/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo351;
import javax.swing.JOptionPane;

/* @author sonha */
public class Algoritmo351 {
    public static void main(String[] args) {
        int L, num;
        
        Pessoa pe = new Pessoa();
        
        for(L=0; L<=4; L++){
            pe.nome[L] = JOptionPane.showInputDialog("\nNome "+ (L+1) +": "); 
        }
        
        for(L=0; L<=4; L++){
            System.out.println("\nNome " +(L+1)+ ": " +pe.nome[L]);
        }
        
       num = Integer.parseInt(JOptionPane.showInputDialog("\nDigite o numero da pessoa: "));
       
       while(num < 1 || num > 5){
            System.out.println("\nNumero fora do intervalo");           
            num = Integer.parseInt(JOptionPane.showInputDialog("\nDigite o numero da pessoa: "));
       }
       
       System.out.println("\n" +pe.nome[num -1]);
       System.out.println("\n");
    }
}




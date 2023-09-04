/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algaritmo358;
import javax.swing.JOptionPane;

/**
 *
 * @author sonha
 */
public class Algaritmo358 {

    public static void main(String[] args) {
        int a;
        float lucro;
        Produto pr = new Produto();
        
        int tdez = 0; //totlucromenor10
        int tvinte = 0; // totlucromenor20
        int tmaior = 0; // totlucromaior20
        
        for(a=0; a<10; a++){
            pr.pcompra[a]=Float.parseFloat(JOptionPane.showInputDialog("\nPreco de compra: ")); 
            pr.pvenda[a]=Float.parseFloat(JOptionPane.showInputDialog("\nPreco de venda: ")); 
        }
        
        for(a=0; a<10; a++){
            lucro = pr.pvenda[a] - pr.pcompra[a];
            
            if(lucro<10.0){ tdez++; }
            else{
                if(lucro <= 20.0){ tvinte++; }
                else{ tmaior++; }
            }
        }
        
        System.out.println("\nTotal de mercadorias com lucro < 10%: " +tdez);
        System.out.println("\nTotal de mercadorias com 10% <= lucro <= 20%: " +tvinte);
        System.out.println("\nTotal de mercadorias com lucro > 20%: " +tmaior);
        
        System.out.println("\n");
    }   
    
}

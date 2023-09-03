/*Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license*/

package com.mycompany.algoritmo356;

import javax.swing.JOptionPane;

/*@author sonha */
public class Algoritmo356 {

    public static void main(String[] args) {
        int L, c, t;
        Aluno al = new Aluno();
        
        for(L=0; L<=14; L++){
            al.nome[L] = JOptionPane.showInputDialog("\n\nDigite " +(L+1)+"° nome: ");
            
            while(al.nome[L].length() > 30){
                System.out.println("\nNomes com ate 30 caracteres");
                al.nome[L] = JOptionPane.showInputDialog("\n\nDigite "+ (L+1) +"° nome: "); 
            }
        
            t = 30 - 
                    al.nome[L].length();
            
            for(c=1; c<=t; c++){
                StringBuilder builder = new StringBuilder(al.nome[L]);
                builder.append(" "); // Adiciona um espaço em branco
                al.nome[L] = builder.toString();
            }
            
            al.pr1[L]=Float.parseFloat(JOptionPane.showInputDialog("\nDigite 1ª nota: ")); 
            al.pr2[L]=Float.parseFloat(JOptionPane.showInputDialog("\nDigite 2ª nota: ")); 
            
            al.media[L] = (int) Math.round((al.pr1[L] + al.pr2[L]) / 2.0);
            
            if(al.media[L] >= 5){ al.sit[L] = "AP"; }
            else{ al.sit[L] = "RP"; }    
        }
        
        System.out.println("\n\n\n\t\t\tRELACAO FINAL\n");
        for(L=0; L<=14; L++){
            System.out.println("\n" +(L+1)+ " - " +al.nome[L]+ "\t" +al.pr1[L]+ "\t" 
            +al.pr2[L]+ "\t" +al.media[L]+ "\t" +al.sit[L]);
        }
        
        System.out.println("\n");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo348;
import javax.swing.JOptionPane;

/**
 *
 * @author sonha
 */
public class Algoritmo348 {

    public static void main(String[] args) {
        Aluno alunos = new Aluno();
        
        for(int L=0; L<=4; L++){
            alunos.nome[L] = JOptionPane.showInputDialog("\nDigite "+ (L+1) +"º nome: "); 
            System.out.println("\nAluno: "+ alunos.nome[L]);
            
            alunos.pr1[L]=Float.parseFloat(JOptionPane.showInputDialog("\nDigite 1ª nota: ")); 
            System.out.println("\n1° Nota: "+ alunos.pr1[L]);
            
            alunos.pr2[L]=Float.parseFloat(JOptionPane.showInputDialog("\nDigite 2ª nota: ")); 
            System.out.println("\n2° Nota: "+ alunos.pr2[L]);
            
            alunos.media[L] = (alunos.pr1[L] + alunos.pr2[L])/2;
        }
        
        System.out.println("\n\n\n\t\t\t\tRELACAO FINAL\n");
        for(int L=0; L<=4; L++){
            System.out.println("\n"+ (L+1) +"° Aluno - "+ alunos.nome[L]);
            System.out.println("\n"+ alunos.pr1[L] +"\t"+ alunos.pr2[L] +"\t"+ alunos.media[L]);
        }    
        
        System.out.println("\n");
    }
}

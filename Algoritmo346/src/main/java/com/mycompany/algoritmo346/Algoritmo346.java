/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license */

package com.mycompany.algoritmo346;
import javax.swing.JOptionPane;

/* * @author sonha */
public class Algoritmo346 {
    public static void main(String[] args) {
        int op, x, tam;
        String frase;        
        
        do{ 
            System.out.println("\nMenu");
            System.out.println("\nl - Imprime o comprimento da frase");
            System.out.println( "\n2 - Imprime os dois primeiros e os dois ultimos caracteres da frase");
            System.out.println("\n3 - Imprime a frase espelhada");
            System.out.println("\n4 - Termina o algoritmo");

            op = Integer.parseInt(JOptionPane.showInputDialog("OPÇÃO:"));  
            
            if(op == 1){
                frase= JOptionPane.showInputDialog("Digite uma frase: ");
                System.out.println("\nFrase: " +frase);

                tam = frase.length();
                System.out.println("Numero de caracteres da frase: " +tam);
            }else{
                if(op == 2){
                    frase = JOptionPane.showInputDialog("Digite uma frase:");
                    System.out.println("\nFrase: " +frase);
                    System.out.println("Os dois primeiros caracteres: " +frase.substring(0, 2));
                    tam = frase.length() - 2;
                    System.out.println("Os dois ultimos caracteres: " +frase.substring(tam));
                }else{
                    if(op == 3){
                        frase= JOptionPane.showInputDialog("Digite uma frase:");
                        System.out.println("\nFrase: " +frase);

                        StringBuilder fraseEspelhada = new StringBuilder();
                        
                        for(x = frase.length() - 1; x >= 0; x--){
                            fraseEspelhada.append(frase.charAt(x));
                        }
                        System.out.println(fraseEspelhada.toString());

                    }else{
                        if(op == 4){
                            System.out.println("\nFim do algoritmo.");
                        }else{
                            System.out.println("\nOpcao nao disponivel.");
                        }
                    }
                }
            }
            System.out.println("\n");
        }
        while(op != 4);
    }
}

package com.mycompany.algoritmo360;
import javax.swing.JOptionPane;

public class Algoritmo360 {
    public static void main(String[] args) {
        int data, i, dia, mes;
        Data d = new Data();
        
        for(i=0; i<12; i++){
            d.signo[i] = JOptionPane.showInputDialog("\nDigite o signo: "); 
            d.ultdia[i] = Integer.parseInt(JOptionPane.showInputDialog("\nDigite o ultimo dia: ")); 
        }
        
        data = Integer.parseInt(JOptionPane.showInputDialog("\nDigite a data no formato ddmm ou 9999 para terminar: ")); 

        while(data != 9999){
            dia = data / 100;
            mes = data % 100;
            mes --;
            
            if(dia > d.ultdia[mes]){
               mes = (mes + 1) % 12; 
            }
            System.out.println("\nSigno; " +d.signo[mes]+ "\n");
                    
            data = Integer.parseInt(JOptionPane.showInputDialog("\nDigite a data no formato ddmm ou 9999 para terminar: ")); 
        }
    }
}

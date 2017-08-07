/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;

import java.util.Scanner;

/**
 *
 * @author FREDY CASTRO
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    // TODO code application logic here
        Scanner reader = new Scanner(System.in);
		System.out.print("Introduzca la cantidad de casos de prueba: ");
		int cantidad = reader.nextInt();
		int arreglo[]=new int[cantidad];
		int j=0;
		int contador=0;
		for(int i=0;i<cantidad;i++) {
			System.out.print("Valor "+j+++" : ");
			arreglo[i]=reader.nextInt();	
		}
		System.out.println("Resultado");
		for(int i=0;i<cantidad;i++) {
			if(arreglo[i]>=1&&arreglo[i]<=10000000) {
				for (j=5; arreglo[i]/j>=1; j *= 5) {
                                    contador += arreglo[i]/j;
				}
			}
			else {
				System.out.println("NUMERO ERRONEO");
			}
			System.out.println("Valor para "+arreglo[i]+" : "+contador);	
			contador=0;
		}
    
        // TODO code application logic here
    }
    
}

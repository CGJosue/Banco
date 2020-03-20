/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexcepciones;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class PE2 {
    public static void main(String[] args) {
        Date fecha=new Date();
        System.out.println("Fecha: "+fecha);
        int numeros[]={1,2,3,4,5};
        int numeros2[]=new int[numeros.length+1];
        System.arraycopy(numeros, 0, numeros2, 0, 5);
        System.out.println("Arreglos: [");
        for (int i : numeros2){
            System.out.println(" "+i);
        }
        System.out.println(" ]");
        numeros=numeros2;
        
        int opc;
        Scanner scan=new Scanner(System.in);
        System.out.println("Dime un numero: ");
        opc=scan.nextInt();
        System.out.println("Tu numero es "+opc);
         
    }
}

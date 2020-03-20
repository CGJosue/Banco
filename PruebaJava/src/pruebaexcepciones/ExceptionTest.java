/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexcepciones;

/**
 *
 * @author sinfante
 */
public class ExceptionTest {
    public static void main(String[] args) {
        int valores[]={5,3,9,1,0,7};
        
        System.out.println("Imprimiento arreglo...");
        //Imprimimos los valores en el arreglo
        //El codigo que me podria arrojar una excepcion, lo ejecutamos
        //en un bloque try-catch
        try{
            for(int i=0;i<6;i++){
                System.out.println("valores["+i+"]="+valores[i]);
                System.out.println("10/"+valores[i]+"="+(10/valores[i]));
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Te saliste! ("+e.getMessage()+")");
        }
        catch(ArithmeticException e){
            System.out.println("Error matematico: "+e.getMessage());
        }
        finally{
            System.out.println("Esto se ejecuta, ocurra o no ocurra la excepcion");
        }
        
        System.out.println("Servido...");
    }
    
}

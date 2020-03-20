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
//Objetos para manejar errores de fecha
public class FechaException extends Exception {
    
    public FechaException(){
        super("Error en fecha!");
    }
    
    public FechaException(String message){
        super(message);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author sinfante
 */
public class Perro extends Animal{
    
    @Override
    public void hacerRuido(){
        System.out.println("Obligame prro!...");
    } 
    @Override
    public void comer(){
        System.out.println("Comiendo basura del bote....");
    }
    public void jugar(){
        System.out.println("Persiguiendome la cola...");
    }
    
}

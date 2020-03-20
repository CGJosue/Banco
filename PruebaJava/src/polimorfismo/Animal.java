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
public abstract class Animal {
    float tamanio;
    float edad;
    float peso;
    //Podemos declarar un metodo abstracto, que no tendra codigo
    //con la palabra reservada abstract
    public abstract void comer();
    public abstract void hacerRuido();
    public void dormir(){
        System.out.println("zzzzz.... zzzz.... ");
    }
    
}

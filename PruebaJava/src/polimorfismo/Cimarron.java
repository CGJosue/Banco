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
public class Cimarron extends Animal{
    
    public void buscarAKiko(){
        System.out.println("Buscando una ratota...");
    }

    @Override
    public void comer() {
        System.out.println("No tengo para comer... no me ha pagado Kiko...");
    }

    @Override
    public void hacerRuido() {
        System.out.println("Con esfuerzo... con destreza....");
    }
    
}

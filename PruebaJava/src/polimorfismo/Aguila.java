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
//Una clase puede implementar una interfaz. De esta forma
//Los objetos de esta clase podran ser considerados como
//objetos del tipo de la interfaz.
public class Aguila extends Animal implements Volador{

    public void cazar(){
        System.out.println("Cazando un conejo...");
    }
    @Override
    public void comer() {
        cazar();
        System.out.println("Comiendo conejo...");
    }

    @Override
    public void hacerRuido() {
        System.out.println("Odiame mas....");
    }

    @Override
    public void volar() {
        System.out.println("Americaaa....");
    }
    
}

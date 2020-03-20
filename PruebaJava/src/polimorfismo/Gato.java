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
public class Gato extends Animal{

    public void cazar(){
        System.out.println("Cazando un raton...");
    }
    
    @Override
    public void comer() {
        cazar();
        System.out.println("Comiendo un raton que acabo de cazar...");
    }

    @Override
    public void hacerRuido() {
        System.out.println("Miao...");
    }
}

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
public class PruebaPolimorfismo {
    public static void main(String[] args) {
        Animal animales[]; //Variable para un arreglo. Sera necesario crearlo
        animales=new Animal[10];
        //Sera necesario crear los objetos para cada celda del arreglo
        for(int i=0;i<animales.length;i++){
            int tipo=(int)(Math.random()*6);
            switch(tipo){
                case 0: animales[i]=new Perro();break;
                case 1: animales[i]=new Gato();break;
                case 2: animales[i]=new Pollo();break;
                case 3: animales[i]=new Aguila();break;
                case 4:animales[i]=new GatoVolador();break;
                default: animales[i]=new Cimarron();break;
            }     
        }
        
        //Hacemos que los animales hagan ruido
        //Utilizamos for mejorado (enhanced for)
        for (Animal animal : animales) {
            animal.hacerRuido();
            animal.comer();
            //Averiguamos si el animal es un aguila
            //Utilizamos el operador instanceof 
            if(animal instanceof Volador ){
                Volador animal_volador=(Volador)animal;
                animal_volador.volar();
            }         
        }
                
    }
}

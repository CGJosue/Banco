
import pruebajava.Persona; //Equivalente a include
import pruebajava.Estudiante;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sinfante
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("Primera aplicacion en netbeans...");
        
        Persona la_persona=new Persona("Nicanor");
        
        Persona la_persona2=new Persona("Jorge al niño",28);
        Persona la_persona3=new Estudiante(666666);
        
        //la_persona2=la_persona;
        la_persona2.setNombre("Sempronio");
        la_persona2.setEdad(30);
        
        
        
        la_persona.saludar();
        la_persona2.saludar();
        la_persona3.saludar();
        
        //Los objetos que creamos en java, deben ser creados con new.
        //NO es necesario eliminarlos de memoria. La maquina virtual tiene
        //un proceso que corre paralelo al programa llamado "garbage collector".
        //Este proceso periodicamente busca objetos que no esten asignados a una
        //variable de referencia. Borra los objetos que no esten en uso.
        
    }
}

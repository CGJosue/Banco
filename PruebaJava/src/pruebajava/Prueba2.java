/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava;

/**
 *
 * @author sinfante
 */
public class Prueba2 {
    
    public static void main(String[] args) {
        
        Estudiante estudiante1=new Estudiante("Sosimo Perez");
        
        Estudiante estudiante2=new Estudiante("Eutanasio Dominguez");
        
        Estudiante estudiante3=new Estudiante("Sosimo Perez");
        
        //Cuando utilizamos == se comparan las referencias en las variables
        //No se comparan los objetos en las variables de referencia
        if(estudiante1==estudiante2){
            System.out.println("Estudiante1 y estudiante2 son el mismo");
        }
        else{
            System.out.println("Estudiante1 y estudiante2 son diferentes");
        }
        
        if(estudiante1==estudiante3){
            System.out.println("Estudiante1 y estudiante3 son el mismo");
        }
        else{
            System.out.println("Estudiante1 y estudiante3 son diferentes");
        }
        //La forma correcta de verificar si 2 objetos son iguales es con
        //el metodo equals(), heredado de la clase Object.
        //equals debe comparar a nivel logico.
        if(estudiante1.equals(estudiante2)){
            System.out.println("Estudiante1 y estudiante2 son el mismo");
        }
        else{
            System.out.println("Estudiante1 y estudiante2 son diferentes");
        }
        if(estudiante1.equals(estudiante3)){
            System.out.println("Estudiante1 y estudiante3 son el mismo");
        }
        else{
            System.out.println("Estudiante1 y estudiante3 son diferentes");
        }
        
        System.out.println("Estudiante1:"+estudiante1 );
        System.out.println("Estudiante2:"+estudiante2 );
        System.out.println("Estudiante3:"+estudiante3 );
        System.out.println("Proxima matricula a asignar: "+
                Estudiante.getNextMatricula());
        
        
        
        
        
    }
    
}

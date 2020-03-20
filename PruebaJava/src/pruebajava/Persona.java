package pruebajava;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sinfante
 */
public class Persona {
    protected int edad;
    protected float estatura;
    protected String nombre="Abundio";
    public Persona(){
        //Si no declaramos un constructor, java le asigna un
        //constructor por default. El constructor default no
        //hace nada.
        edad=20;
        estatura=1.7f;
    }
    public Persona(String nombre){
        this.nombre=nombre;
    }
    public Persona(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    //en Java hay 4 niveles de proteccion.
    //public, protected, private y default (o package).
    //En el nivel default, las clases que pertenecen al mismo paquete
    //tienen acceso a los elementos (es como si las clases del
    //paquete al que pertenece fueran sus amigos).
    public void saludar(){
        System.out.println("Soy "+nombre+" y tengo "+edad+" anios...");
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}

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
//La clase estudiante se deriva de la clase persona.
//Para derivar una clase de otra, se utiliza la palabra reservada extends.
public class Estudiante extends Persona {
    //El contador para generar matriculas lo declaramos como
    //variable de clase. Una variable de clase pertenece a
    //la clase, es decir a todos los objetos que pertenen a
    //la clase.
    //Para declarar una variable de clase, se declara de tipo
    //static
    private static int matricula_cont=666666;
    //La matricula es variable de instancia. Solo existe
    //dentro de un objeto en particular y pertenece a ese
    //ese objeto
    int matricula;
    public Estudiante(String nombre){
        this.nombre=nombre;
        this.edad=18;
        this.matricula=matricula_cont;
        //incrementamos el conteo de matricula
        matricula_cont++;
    }
    public Estudiante(int matricula) {
        //De igual manera que en C++, los constructores se invocan recursivamente.
        //Se ejecuta primero el codigo del constructor de la clase padre, y
        //despues el codigo de este constructor.
        //Si no se especifica que constructor se ejecutara, automaticamente se
        //ejecuta el constructor sin parametros de la clase padre.
        this.matricula = matricula;
    }
    public Estudiante(String nombre,int matricula){
        //para ejecutar un constructor especifico de la clase padre, se utiliza
        //super(). La invocacion a super debe ser siempre la primera linea de
        //codigo del constructor
        super(nombre,19);
        this.matricula=matricula;
    }
    public Estudiante(String nombre, int edad, int matricula){
        super(nombre,edad);
        this.matricula=matricula;
    }
    public Estudiante(){
        //cuando declaramos un constructor, el constructor defaul ya no existira.
        //Si queremos un constructor sin parametros, es necesario declararlo.
    }
    //Metodo para saber en donde va el conteo de las
    //matriculas
    //El metodo lo definimos como metodo de clase (no de
    //instancia).
    //Los metodos de clase no necesitan de una instancia para
    //poder ser invocados.
    //Estudiante.getNextMatricula().
    //En un metodo estatico, solo se puede acceder a variables
    //estaticas, y locales
    static int getNextMatricula(){
        return matricula_cont;
    }
    
    
    @Override
    public void saludar(){
        System.out.print("Hola, soy el estudiante "+getNombre()+", con matricula ");
        System.out.println(""+matricula+"...");
    }
    
    //modificamos que es lo que hace Estudiante cuando se compara con equals.
    //El codigo heredado de Object compara referencia y clase. Necesitamos que
    //compare nombre y matricula
    
    @Override
    //compara este objeto contra el objeto o, devuelve verdadero si son iguales
    //(comparamos o contra this)
    public boolean equals(Object o){
        if(o instanceof Estudiante){
            //Casteamos o para verlo como estudiante
            Estudiante e2=(Estudiante)o;
            if(this.matricula==e2.matricula)
                return true;
        }
        return false;
    }
    //Cuando un objeto es impreso en println, o cuando es concatenado a una
    //cadena, el objeto es convertido a cadena por medio del metodo toString().
   //Si queremos modificar el comportamiento basico definido en Object, necesitamos
    //sobreescribior toString().

    @Override
    public String toString() {
        //Generamos una cadena que contenga el nombre, la edad, y la matricula
        String ret="Estudiante "+nombre+" , "+edad+" anios, matricula "+matricula;
        return ret; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexcepciones;

/**
 *
 * @author sinfante
 */
public class ExceptionTest2 {
    public static void main(String[] args) {
        try{
        Fecha fecha1=new Fecha(15,9,1810);
        Fecha fecha2=new Fecha();
        Fecha fecha3=new Fecha(20,20,2020);
        
            fecha2.setDia(11);
            fecha2.setMes(19);
            fecha2.setAnio(2020);
            System.out.println("Fecha1: "+fecha1);
        System.out.println("Fecha2:"+fecha2);
        System.out.println("Fecha3:"+fecha3);
        }catch(FechaException e){
            System.out.println("Error en fecha: "+e.getMessage());
        }
        
        
    }
}

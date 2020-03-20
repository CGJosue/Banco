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
public class Fecha {
    
    private int dia;

    private int mes;
    
    private int anio;

    public Fecha(int dia, int mes, int anio)throws FechaException {
        this.dia = dia;
        setMes(mes);
        this.anio = anio;
    }

    public Fecha() {
    }
     
    /**
     * Get the value of anio
     *
     * @return the value of anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * Set the value of anio
     *
     * @param anio new value of anio
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }


    /**
     * Get the value of mes
     *
     * @return the value of mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * Set the value of mes
     *
     * @param mes new value of mes
     */
    public void setMes(int mes) throws FechaException {
        if(mes<1||mes>12){
            //Necesitamos notificar el error por medio de una excepcion
            FechaException e=new FechaException("Mes invalido: "+mes);
            throw e;
        }
        this.mes = mes;
    }

    /**
     * Get the value of dia
     *
     * @return the value of dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * Set the value of dia
     *
     * @param dia new value of dia
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        String ret;
        if(dia<10)
            ret="0"+dia+"/";
        else
            ret=""+dia+"/";
        if(mes<10)
            ret+="0"+mes+"/";
        else
            ret+=""+mes+"/";
        ret+=anio;   
        return ret; //To change body of generated methods, choose Tools | Templates.
    }
    
}

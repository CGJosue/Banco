/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author Josue
 */
public class Principal {
    public static void main(String[] args) {
        Banco banco=new Banco("BAAANKITO");
        
        CuentaHabiente ch=banco.crearCuentaHabiente("Roberto Perez Esparza");
        banco.crearCuentaDeCheques(ch, 5000);
        banco.crearCuentaDeAhorros(ch, 5000);
        
        ch=banco.crearCuentaHabiente("Emmet Dipp Alvarez");
        banco.crearCuentaDeCheques(ch, 5000);
        banco.crearCuentaDeAhorros(ch, 5000);
        
        ch=banco.crearCuentaHabiente("Humberto Ramos Salgado");
        banco.crearCuentaDeCheques(ch, 5000);
        banco.crearCuentaDeAhorros(ch, 5000);
        
        banco.imprimirReporte();
        
        
        System.out.println("Transferencia: \n Cuenta Origen:");
        nc=scan.nextInt();
        
        Cuenta cuenta1=banco.getCuenta(nc);
        System.out.println("Cuenta Destino: ");
        nc=scan.nextInt();
        Cuenta cuenta2=banco.getCuenta(nc);
        
        if(cuenta1!=null&&cuenta2!=null){
            System.out.println("Cantidad a transferir");
        }
    }
}

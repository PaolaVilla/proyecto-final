/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codigovago.controlador;

import com.codigovago.modelo.Empleado;
import com.codigovago.modelo.Usuario;
import com.codigovago.modelo.accesoDatos.Conexion;
import com.codigovago.modelo.accesoDatos.Empleados;
import com.codigovago.modelo.accesoDatos.Login; 
/**
 *
 * @author Jeison / Código Vago - www.codigovago.com 
 */
public class ClaseControl{
    
    static Conexion conexion = new Conexion();
    static Empleados empleados = new Empleados();
    static Login login = new Login();
    static Empleado empleado;
    static Usuario usuario;
    static Roles roles = new Roles();
    public static void main(String[] args) {
        //getConexion();
//        getRegistroEmpleado( new Empleado(2, "17645364565","Mesero","Daniela Carmen", "Tene Ruiz", "0995669394", "Chunhi - Ecuador", "jeisonhenaselec2@gmail.com", "tarde"));
//        getBuscaUsuario(new Usuario("dtene2", "codigovago"));
        //getActualizaEmpleado(new Empleado("0605694254", "Jessica Dayana", "Caguana Gutierres", "0995669399", "Alausí - Ecuador", "jessicadayana@gmail.com", "mesero"));
        //getActualizaClave(new Usuario("jcaguana1", "123"));
        //getRecuperarClave(new Empleado("jeisoncaguana@gmail.com"));
        roles.index();
 
    }
    public static void getBuscaUsuario( Usuario usuario){
        login.buscarUsuario(usuario);
    }
    public static void getConexion(){
        conexion.getConexion();
    }
    public static void getRegistroEmpleado( Empleado empleado ){
        if ( empleados.registrarEmpleado( empleado ) ) {
            System.out.println("Se grabo con exito");
        }else{
            System.out.println("No grabo con exito");
        }
    }
//    public static void getActualizaEmpleado( Empleado empleado ){
//        if ( empleados.actualizarEmpleado( empleado ) ) {
//            System.out.println("Se actualizo con exito");
//        }else{
//            System.out.println("No actualizo");
//        }
//    }
//    public static void getActualizaClave( Usuario usuario ){
//        if ( empleados.actualizarClave( usuario ) ) {
//            System.out.println("Se actualizo con exito su nueva clave");
//        }else{
//            System.out.println("No actualizo la clave");
//        }
//    }
//   
//    public static void getRecuperarClave( Empleado empleado ){
//        if ( login.recuperarClave( empleado ) ) {
//            System.out.println("Correo enviado...");
//        }else{
//            System.out.println("Correo no enviado...");
//        }
//    }
}

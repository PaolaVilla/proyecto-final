/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codigovago.modelo.accesoDatos;
 
import com.codigovago.controlador.Roles;
import com.codigovago.modelo.Empleado;
import com.codigovago.modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeison / Código Vago - www.codigovago.com 
 */
public class Login extends Conexion{
    static CorreoElectronico correo = new CorreoElectronico();
    static PreparedStatement ps = null;
    static  Roles roles = new Roles();
    static ResultSet rs = null;
    Connection conexion = getConexion();
    
    public boolean buscarUsuario( Usuario usuario ){ 
        String query = "SELECT usu_codigo,usu_usuario,usu_contrasena,usu_cargo FROM usuario WHERE usu_usuario = ? AND usu_contrasena = ? LIMIT 1;";
        try {  
            ps = conexion.prepareStatement( query );
            ps.setString( 1, usuario.getUsuario_uss()); 
            ps.setString( 2, usuario.getClave_uss()); 
            rs = ps.executeQuery();
            
            if ( rs.next() ) {
                if ( usuario.getUsuario_uss().equals(rs.getString( 2 )) && usuario.getClave_uss().equals(rs.getString( 3 ))  ) {
                    usuario.setCodigo_uss(rs.getInt(1));
                    usuario.setCargo_emp(rs.getString(4));
                    roles.rolesUsuario( usuario );
                return true;
                } else {
                    JOptionPane.showMessageDialog(null,"error 505");
                    return false;
                }
            }
        } catch (SQLException ex) {
            System.out.println( ex.toString() );
        } 
        return false;
    }

//    public boolean recuperarClave( Empleado empleado ){
//       String query = "SELECT correo_emp FROM empleado WHERE correo_emp = ? LIMIT 1;";
//        try { 
//            ps = conexion.prepareStatement( query );
//            ps.setString( 1, empleado.getCorreo_emp());
//            rs = ps.executeQuery();
//            
//            if ( rs.next() ) {
//                if ( empleado.getCorreo_emp().equals(rs.getString( 1 ))) {
//                     correo.setCorreo( empleado );
//                return true;
//                } else { 
//                    return false;
//                }
//            }
//        } catch (SQLException ex) {
//            System.out.println( ex.toString() );
//        }finally{
//            try {
//                conexion.close();
//
//            } catch (SQLException e) {
//                System.out.println( e.toString() );
//            }
//        }
//        return false;
//    }
}

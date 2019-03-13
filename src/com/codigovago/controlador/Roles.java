/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codigovago.controlador;

import com.codigovago.modelo.Usuario;
import com.codigovago.vista.FrmAdministrador;
import com.codigovago.vista.FrmLogin;
import com.codigovago.vista.FrmMesa;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeison / Código Vago - www.codigovago.com
 */
public class Roles {

    public static int idEmpleado;

    public void index() {
        FrmLogin FrmLogin = new FrmLogin();
        FrmLogin.setVisible(true);
    }

    public void rolMesero() {
        FrmMesa FrmMesa = new FrmMesa();
        FrmMesa.setVisible(true);
    }

    public void rolChef() {
        JOptionPane.showMessageDialog(null, "Interfaz Chef");
    }

    public void rolesUsuario(Usuario usuario) {
        switch (usuario.getCargo_emp()) {
            case "Mesero":
                Roles.idEmpleado =usuario.getCodigo_uss();
                rolMesero();
                break;
            case "Chef":
                rolChef();
                break;
            default:
                JOptionPane.showMessageDialog(null, "eror");
                break;
        }
    }
}

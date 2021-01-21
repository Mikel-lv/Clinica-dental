/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.dental;

import Entidades.*;

/**
 *
 * @author Mikel
 */
public class ClinicaDental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Enfermeria mikel = Enfermeria.nuevoEnfermeria();
        System.out.println("Enermero Mikel:" + mikel);
        Secretariado s = Secretariado.nuevoSecretariado();
//        InformeGlobal i = s.nuevoInformeGlobal();
        InformeGlobal.nuevoInformeGlobal(s);
    }
}

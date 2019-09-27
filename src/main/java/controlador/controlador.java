/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Numero;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;


/**
 *
 * @author luis fernando
 * etiqueta para reconozcan la clase
 */
@ManagedBean
@Named(value="controlador")
@ApplicationScoped
public class controlador {
    private Numero numero = new Numero(); 

    public controlador() {
    }

    public Numero getNumero() {
        return numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }
    
    
}

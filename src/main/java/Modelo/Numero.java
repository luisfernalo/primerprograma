/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author luis fernando
 */
/**
 * generar una valriable para guardar el numero y hacer get y set 
 * @author luis fernando
 */
public class Numero {
    private int contador;

    public Numero() {
    }

    public Numero(int contador) {
        this.contador = contador;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    /**
     * metodo que sumara 1 al contador y lo retorna
     * @return 
     */
    public int sumar(){
        contador ++;
        return contador;
    }
    
}

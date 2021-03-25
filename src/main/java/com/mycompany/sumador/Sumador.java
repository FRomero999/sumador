/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sumador;

/**
 *
 * @author paco
 */
public class Sumador {
    
    private Integer resultado;

    public Sumador(Integer resultado) {
        this.resultado = resultado;
    }

    public Integer getResultado() {
        return resultado;
    }

    public void setResultado(Integer resultado) {
        this.resultado = resultado;
    }
    
    public void sumar(Integer cantidad){
        this.resultado = this.resultado + cantidad;
    }
    
    public void reset(){
        this.resultado=0;
    }

    
}

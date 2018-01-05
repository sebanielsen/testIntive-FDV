/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testejemplo;

/**
 *
 * @author sebastian
 */
public class TestExample {   
    public double TestDescuentoPorcentaje(int porcentaje, int valor) {
        double resultado=0.0;
        return valor-(porcentaje*valor)/100;
    }
    
    public String TestGetTipoDeAlquiler(int tipoDeAlquiler){
            String tipo="";
        switch(tipoDeAlquiler) {
            case 1: tipo="Alquiler por Hora";
                    break;
                    
            case 2: tipo="Alquiler Diario";
                    break;
                    
            case 3: tipo="Alquiler Semanal";
                    break;     
        }
        return tipo;
    }
    
    public double importeaCobrar(int op, int cant) {
        double importe = 0.0;
        switch (op) {
            case 1:
                importe = cant * 5;
                break;
            case 2:
                importe = cant * 20;
                break;
            case 3:
                importe = cant * 60;
                break;
        }
        return importe;
    }

}

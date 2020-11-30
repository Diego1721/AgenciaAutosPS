/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

/**
 *
 * @author snell
 */
public abstract class CarroBasico implements Cloneable{

    private String Linea;
    private String Modelo;
    private int Valor;
    
    
    public CarroBasico clone() throws CloneNotSupportedException {
    return (CarroBasico) super.clone();
    }
    public abstract String getMarca();
    

    public String getLinea() {
        return Linea;
    }

    public void setLinea(String Linea) {
        this.Linea = Linea;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }
 
}

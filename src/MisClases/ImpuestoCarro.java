/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;
import static Interfaz.InterfazImpuesto.*;
public class ImpuestoCarro {
    private static ImpuestoCarro instancia;
    private int impuesto;
    private int valor;
    private int saldototal;
    
    public ImpuestoCarro() {
        impuesto = 0;
        valor = 0;
        saldototal = 0;
    }
    public static ImpuestoCarro ObtenerInstancia() {
        if (instancia == null) {
            instancia = new ImpuestoCarro();
            System.out.println("Se va a generar un impuesto");
        } 
        return instancia;
    }
    public void AsignarDatos(int valor1) {

        valor = valor1;
    }
    
    public int CalcularImpuesto() {

        if (valor >= 1 && valor <= 29999999) {

            impuesto = (int) ((1.5 * valor) / 100);

        } else {
            if (valor >= 30000000 && valor <= 69999999) {
                impuesto = ((2 * valor) / 100);
            } else {
                if (valor >= 70000000 && valor <= 199999999) {
                    impuesto = (int) ((2.5 * valor) / 100);
                } else {
                    if (valor >= 200000000) {
                        impuesto = ((4 * valor) / 100);
                    }
                }
            }

            
        }
        return impuesto;
    } 
    public int ImpuestoTotal(){
        
        boolean pagop = Ppago.isSelected(), servipublico = Spublico.isSelected(),translado = Trans.isSelected();
        
        if(pagop==true ){
            if(servipublico==true && translado == true){
                saldototal= (CalcularImpuesto()-((CalcularImpuesto()*10)/100));
                saldototal = saldototal-50000;
                saldototal = (saldototal-((saldototal*5)/100));
                return saldototal;
            }else{
                if(servipublico==true && translado ==false){
                    saldototal= (CalcularImpuesto()-((CalcularImpuesto()*10)/100));
                    saldototal = saldototal-50000;
                    return saldototal;
                }else{
                    if(servipublico == false && translado == true){
                        saldototal= (CalcularImpuesto()-((CalcularImpuesto()*10)/100));
                        saldototal = (saldototal-((saldototal*5)/100));
                        return saldototal;
                    }else{
                        saldototal= (CalcularImpuesto()-((CalcularImpuesto()*10)/100));
                        return saldototal;
                    }
                }
            }
        }
        if(servipublico== true){
            if(translado==true){
                saldototal = (CalcularImpuesto()-50000);
                saldototal = (saldototal-((saldototal*5)/100)); 
                return saldototal;
            }else{
                 saldototal = (CalcularImpuesto()-50000);
                 return saldototal;
            }
        }
        if(translado == true){
            saldototal= saldototal= (CalcularImpuesto()-((CalcularImpuesto()*5)/100));
            return saldototal;
        }
      
  
        return CalcularImpuesto();
    }
}

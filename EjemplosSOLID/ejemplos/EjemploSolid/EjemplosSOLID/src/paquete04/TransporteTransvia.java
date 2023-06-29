/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author SALA I
 */
public class TransporteTransvia extends Transporte{
     private String cooperativaTransvia;
    
    
    public void establecerCooperativaTransvia(String n){
        cooperativaTransvia = n;
    }
    
    
    public void establecerTarifa(){
        tarifa = 0.40 + (0.40*0.5);
    }
    
    
    public String obtenerCooperativaTransvia(){
        return cooperativaTransvia;
    }
        
    
}

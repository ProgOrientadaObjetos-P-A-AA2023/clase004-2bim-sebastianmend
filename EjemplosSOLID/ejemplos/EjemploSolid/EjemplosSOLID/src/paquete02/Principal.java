/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Rene", 39);
        Persona persona2 = new Persona("Santiago", 20);

        OperacionesEstudiantes op1 = new OperacionesEstudiantes();

        ArrayList<Persona> miLista = new ArrayList<>();
        miLista.add(persona1);
        miLista.add(persona2);
        
        op1.establecerEstudiante(miLista);
        
        op1.establecerPromedioEdades();
         
        
 

        System.out.printf("%.2f\n", op1.obtenerPromedioEdades());
         System.out.printf("%d\n", op1.obtenerEdadminima());
        
        

    }
}

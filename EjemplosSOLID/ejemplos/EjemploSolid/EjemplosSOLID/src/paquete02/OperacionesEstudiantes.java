/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {

    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private int edadminima;

    public void establecerEstudiante(ArrayList<Persona> lista) {
        estudiantes = lista;
    }

    public void establecerEdadminima(int e) {
        edadminima = e;
    }

    public int obtenerEdadminima() {
        int aux = estudiantes.;
        for (Persona e : obtenerEstudiante()) {
            aux = e.obtenerEdad();
        }
        for (Persona p : obtenerEstudiante()) {
            if (p.obtenerEdad() > aux) {
                aux = p.obtenerEdad();
            } else {
                aux = aux;
            }

           aux=edadminima;
        }
     return edadminima;
    }
    
    
    

    public ArrayList<Persona> obtenerEstudiante() {
        return estudiantes;
    }

    public void establecerPromedioEdades() {
        double suma = 0;
        for (Persona e : obtenerEstudiante()) {
            suma += e.obtenerEdad();
        }
        promedioEdades = suma / obtenerEstudiante().size();
    }

    public double obtenerPromedioEdades() {

        return promedioEdades;
    }

}

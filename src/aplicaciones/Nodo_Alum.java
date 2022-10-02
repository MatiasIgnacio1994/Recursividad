/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicaciones;

/**
 *
 * @author Matias Alarcón 18953342-K
 */
public class Nodo_Alum {

    //ATRIBUTOS
    private String nombre_alumno;
    private int dato_dosis;
    private Nodo_Alum enlace;
    
    //PROPIEDADES
    public void setNombre_alumno(String nombre_alumno) {
        this.nombre_alumno = nombre_alumno;
    }
    
    public String getNombre_alumno() {
    return nombre_alumno;
    }
    
    public void setDato_dosis(int dato_dosis) {
        this.dato_dosis = dato_dosis;
    }
    
    public int getDato_dosis() {
        return dato_dosis;
    }
    
    public void setEnlace(Nodo_Alum enlace) {
    this.enlace = enlace;
    }

    public Nodo_Alum getEnlace() {
        return enlace;
    }
    
    //cONSTRUCTORES
    public Nodo_Alum(String Nombre_Alumno , int dato_dosis, Nodo_Alum enlace) {
        this.dato_dosis = dato_dosis;
        this.enlace = enlace;
        this.nombre_alumno = Nombre_Alumno;
    }
}

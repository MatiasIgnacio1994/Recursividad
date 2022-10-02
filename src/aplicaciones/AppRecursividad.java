/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Matias Alarcón 18953342-K
 */
public class AppRecursividad {
    public static void main(String[] args) {
        Nodo_Alum cabecera = null;
        Nodo_Alum ultimo = null;
        Nodo_Alum nuevo = null;

        int numero,opcion;
        //String strNombre = null;
        String strNumero;
        //String strNombre;
        String menu = "MENU REGISTRO ALUMNOS DOSIS VACUNA COVID\n " +

                "1. Ingrese Datos del Estudiante\n" + 
                "2. Mostrar Lista de Estudiantes\n" + 
                "3. Mostrar Pase de Movilidad\n"+
                "4. Consultar por un estudiante\n" + 
                "0. Salir\n" ;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
       
            switch(opcion){
                case 1: {
                    String nombre;
                    nombre = JOptionPane.showInputDialog("Ingrese nombre: " );
                    strNumero = JOptionPane.showInputDialog("Ingrese dosis");
                    numero = Integer.parseInt(strNumero);
                    nuevo = new Nodo_Alum(nombre,numero,null);
                    
                    if(cabecera==null)
                    {
                        cabecera=nuevo;
                    }
                    else
                    {
                        ultimo.setEnlace(nuevo);
                    }
                    
                    ultimo = nuevo;
                    break;
                }
                
                  case 2: JOptionPane.showMessageDialog(null,mostrarLista(cabecera));
                    break;
                  case 3: JOptionPane.showMessageDialog(null,mostrarPase(cabecera));
                    break;
                  case 4: {
                      String Busnombre;
                      Busnombre= JOptionPane.showInputDialog("Ingrese nombre a buscar");
                      if(buscarLista(Busnombre,cabecera))
                      {
                          JOptionPane.showMessageDialog(null,"Nombre encontrado");
                          JOptionPane.showMessageDialog(null,MostrarResultadoBusqueda(cabecera));
                      }
                      else
                      {
                          JOptionPane.showMessageDialog(null,"Nombre no encontrado.");
                      }
                      break;
                }
                  case 5: JOptionPane.showMessageDialog(null,"Salir del Menu");
                    break;
             }
    }while(opcion != 0);
    }
    public static String mostrarLista(Nodo_Alum actual)
    {
       String mostrar = "";
       while(actual != null)
       {
        mostrar += "-> "+ actual.getNombre_alumno()+ " " + actual.getDato_dosis()+ " dosis\n";
        actual = actual.getEnlace();
       } 
       return mostrar;
    }
    
    public static String mostrarPase(Nodo_Alum actual)
    {
       String mostrar = "";
       while(actual != null)
       {
        if(actual.getDato_dosis()>=3)
        {
            mostrar += "-> "+ actual.getNombre_alumno()+ " " + actual.getDato_dosis()+ " dosis\n";
        }
        actual = actual.getEnlace();
       }
       return mostrar;
    }
    public static boolean buscarLista(String Busnombre, Nodo_Alum actual)
    {
        boolean bandera = false;
        while(actual != null)
        {
            if (Busnombre.equals(actual.getNombre_alumno()))
            {
                bandera = true;  
            }
            actual= actual.getEnlace(); 
        }
        return bandera;
    }
    public static String MostrarResultadoBusqueda(Nodo_Alum actual){
        String mostrar;
        mostrar = "-> "+ actual.getNombre_alumno()+ " " + actual.getDato_dosis()+ " dosis\n";
        return mostrar;
    }
}
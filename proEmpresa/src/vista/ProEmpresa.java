/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import logica.*;

/**
 *
 * @author ivans
 */
public class ProEmpresa {

    private static ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    private static ArrayList<Empleado> listaEmpleadosDpt = new ArrayList<>();
    
    public static void menu(){       
        int opcion;
        do {
            String input = JOptionPane.showInputDialog("¿QUÉ DESEA HACER?"
                    + "\n1. Agregar empleado temporal"
                    + "\n2. Agregar empleado fijo"
                    + "\n3. Agregar empleado por hora"
                    + "\n4. Ver empleados"
                    + "\n5. Empleado por departamento"
                    + "\n6. Salir");

            if (input == null) break; // Cancelar

            opcion = Integer.parseInt(input);


            switch (opcion) {
                case 1:
                    agregarEmpleadoTemporal();
                    break;
                case 2:
                    agregarEmpleadoFijo();
                    break;
                case 3:
                    agregarEmpleadoPorHora();
                    break;
                case 4:
                    mostrarEmpleados();
                    break;
                case 5:
                    mostrarEmpleadoPorDpt();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "¡Hasta pronto!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        } while (opcion != 6);
    }

    public static void agregarEmpleadoTemporal() {
        String nombre = JOptionPane.showInputDialog("Nombre:");
        String fechaNacimiento = JOptionPane.showInputDialog("Fecha de nacimiento (yyyy-MM-dd):");
        String departamento = JOptionPane.showInputDialog("Departamento:");
        String alta = JOptionPane.showInputDialog("Fecha de alta (yyyy-MM-dd):");
        String baja = JOptionPane.showInputDialog("Fecha de baja (yyyy-MM-dd):");

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Calendar fechaAlta = Calendar.getInstance();
        Calendar fechaBaja = Calendar.getInstance();

        try {
            fechaAlta.setTime(formato.parse(alta));
            fechaBaja.setTime(formato.parse(baja));
        } catch (ParseException e) {
            System.err.println("ERRO! ASEGURATE DE QIUE EL FORMATO FECHA SEA CORRECTO");
            e.printStackTrace();
        }

        ETemporal et = new ETemporal(fechaAlta, fechaBaja, nombre, fechaNacimiento, departamento);
        listaEmpleados.add(et);
        JOptionPane.showMessageDialog(null, "Empleado temporal creado:\n" + et);
    }

    public static void agregarEmpleadoFijo() {
        String nombre = JOptionPane.showInputDialog("Nombre:");
        String fechaNacimiento = JOptionPane.showInputDialog("Fecha de nacimiento (yyyy-MM-dd):");
        String departamento = JOptionPane.showInputDialog("Departamento:");
        String alta = JOptionPane.showInputDialog("Fecha de alta (yyyy-MM-dd):");

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Calendar fechaAlta = Calendar.getInstance();

        try {
            fechaAlta.setTime(formato.parse(alta));
        } catch (ParseException e) {
            System.err.println("ERRO! ASEGURATE DE QIUE EL FORMATO FECHA SEA CORRECTO");
            e.printStackTrace();
        }

        EFijo ef = new EFijo(fechaAlta, nombre, fechaNacimiento, departamento);
        listaEmpleados.add(ef);
        JOptionPane.showMessageDialog(null, "Empleado FIJO creado:\n" + ef);        
        
    }
    
    public static void agregarEmpleadoPorHora() {
        String nombre = JOptionPane.showInputDialog("Nombre:");
        String fechaNacimiento = JOptionPane.showInputDialog("Fecha de nacimiento (YYYY-MM-DD):");
        String departamento = JOptionPane.showInputDialog("Departamento:");
        int horas = Integer.parseInt(JOptionPane.showInputDialog("NUMERO DE HORAR TRABAJADAS"));

        EHora eh = new EHora(horas, nombre, fechaNacimiento, departamento);
        listaEmpleados.add(eh);
        JOptionPane.showMessageDialog(null, "Empleado POR HORA creado:\n" + eh);        
    }
    
    public static void mostrarEmpleados(){
        if (listaEmpleados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay empleados registrados.");
        } else {
            //StringBuilder sb = new StringBuilder();
            for (Empleado e : listaEmpleados) {
                JOptionPane.showMessageDialog(null, "Empleado :\n"
                        + "Nombre: " + e.getNombre() + "\n"
                        + "Salario: " + e.calcularSueldo());
                //sb.append(e.toString()).append("\n---------------------\n");
            }
        //JOptionPane.showMessageDialog(null, sb.toString());
        }
    }
    
    public static void mostrarEmpleadoPorDpt(){
        if (listaEmpleados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay empleados registrados.");
        } else {
            String dpt = JOptionPane.showInputDialog(null, "Ingrese el dpt");
            for (Empleado e : listaEmpleados) {
                if(dpt.equalsIgnoreCase(e.getDepartamento())){
                    JOptionPane.showMessageDialog(null, "Nombre "+e.getNombre() + "\nSalario " + e.calcularSueldo());
                }
            }   
        }
    }
    
    public static void main(String[] args) {
        menu();
        // TODO code application logic here
        /*Calendar fechaAlta = Calendar.getInstance();
        Calendar fechaBaja = Calendar.getInstance();
        SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
        
        String alta = "29/06/2025";
        String baja = "04/12/2026";
      
        try {
            fechaAlta.setTime(formato.parse(alta));
            fechaBaja.setTime(formato.parse(baja));
        } catch(ParseException e) {
            System.err.println("");
            e.printStackTrace();
        }
        
        ETemporal e2 = new ETemporal(fechaAlta, fechaBaja, "Iv", "23/03/2000", "sistemad");
        */
        
        
    }
    
}

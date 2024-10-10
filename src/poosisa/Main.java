/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poosisa;



/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
    Empleado empleo = new Empleado("0150531473","David","Sisa");
  /*  Empleadoasalariado empleadoA = new Empleadoasalariado();
    Empleado empleadoC = new EmpleadoPorComision();
    Empleado empleadoH = new EmpleadoPorHoras();
    System.out.println(empleadoA.calcularSalario(100));
    System.out.println(empleadoC.calcularSalario());
    System.out.println(empleadoH.calcularSalario());*/
    System.out.println(empleo.toString());
    }   
}

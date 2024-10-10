/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poosisa;

/**
 *
 * @author Estudiante
 */
public class EmpleadoPorHoras extends Empleado{
    private int numHorasTra = 6;
    private double valorHora = 10;
    @Override
    public double calcularSalario (){
        return numHorasTra * valorHora;
    }

    public int getNumHorasTra() {
        return numHorasTra;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setNumHorasTra(int numHorasTra) {
        this.numHorasTra = numHorasTra;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
}

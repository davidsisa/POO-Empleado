/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poosisa;

/**
 *
 * @author Estudiante
 */
public class EmpleadoPorComision extends Empleado{
    private double totalVentas;
    private double porcentajeComision;
    private double salario = 100;
    
    @Override
    public double calcularSalario(){
        return salario + salario*0.10;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public double getSalario() {
        return salario;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}

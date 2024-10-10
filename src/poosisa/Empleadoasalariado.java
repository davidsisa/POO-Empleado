/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poosisa;

/**
 *
 * @author Estudiante
 */
public class Empleadoasalariado extends Empleado{
    private int aniosAntiguedad = 4;
    private int salario = 100;
    private int cargasFamiliares = 2;
    public double calcularSalario(double valorExtra){
        return this.calcularSalario() + valorExtra;
    }
    @Override
    public double calcularSalario(){
        double pagoA = 0.0;
        double pagoC = 0.0;
        if(aniosAntiguedad < 5){
            pagoA = 80; 
        }else if (aniosAntiguedad < 8){
            pagoA = 120;
        }else if (aniosAntiguedad < 14){
            pagoA = 130;
        }else if (aniosAntiguedad <= 15){
            pagoA = 200;
        }
        if (cargasFamiliares > 0){
            switch (cargasFamiliares) {
            case 1:
                pagoC = 30;
                break;
            case 2:
                pagoC = 70;
                break;
            default :
                pagoC = 100;
                break;
            } 
        }

        return (salario + pagoA + pagoC); 
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poosisa;
import java.util.Date;
/**
 *
 * @author Estudiante
 */
public class Empleado {
    
    String cedula ;
    private String nombre ;
    private String apellido ;
    private Date fecha;
    private String telefono;
    private String direccion;
    protected String cargo;
        
    public Empleado() {
                          
    }
    public Empleado(String cedula, String nombre, String apellido2){
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido2;
        System.out.println(cedula + nombre +apellido2);
    }
    

    public double calcularSalario(){
        return 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString(){
        return " " + cedula + " " + nombre + " " +apellido;
    }
}

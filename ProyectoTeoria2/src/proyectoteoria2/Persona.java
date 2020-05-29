/*
Clase Persona
 */
package proyectoteoria2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;


public class Persona {
   private String _id /*C1*/,nombre, apellido, nacionalidad, genero, telefono, correo;
   private Date fechaNacimiento;
   private Direccion direccion;
   private String identidad;
   private List<DatoFamiliar> refFamiliares;
   private DatoLegal legalesD;
   private Curriculum curriculum;
   private DatosSanitarios datosSanitarios;
   

    public Persona(){
        
    }

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public List<DatoFamiliar> getRefFamiliares() {
        return refFamiliares;
    }

    public void setRefFamiliares(List<DatoFamiliar> refFamiliares) {
        this.refFamiliares = refFamiliares;
    }

    public DatoLegal getLegalesD() {
        return legalesD;
    }

    public void setLegalesD(DatoLegal legalesD) {
        this.legalesD = legalesD;
    }

    public Curriculum getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(Curriculum curriculum) {
        this.curriculum = curriculum;
    }

    public DatosSanitarios getDatosSanitarios() {
        return datosSanitarios;
    }

    public void setDatosSanitarios(DatosSanitarios datosSanitarios) {
        this.datosSanitarios = datosSanitarios;
    }

   
  
}

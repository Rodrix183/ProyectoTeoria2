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
   private List<DatoFamiliar> refFamiliares;
   private DatoLegal legalesD;
   private Curriculum curriculum;
   private DatoSanitario dSalud;

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

    public List<DatoFamiliar> getRefFamiliares() {
        return refFamiliares;
    }

    public void setRefFamiliares(List<DatoFamiliar> refFamiliares) {
        this.refFamiliares = refFamiliares;
    }

    public DatoLegal getdLegales() {
        return legalesD;
    }

    public void setdLegales(DatoLegal dLegales) {
        this.legalesD = dLegales;
    }

    public Curriculum getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(Curriculum curriculum) {
        this.curriculum = curriculum;
    }

    public DatoSanitario getdSalud() {
        return dSalud;
    }

    public void setdSalud(DatoSanitario dSalud) {
        this.dSalud = dSalud;
    }

    @Override
    public String toString() {
        return "Persona{" + "_id=" + _id + ", nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", genero=" + genero + ", telefono=" + telefono + ", correo=" + correo + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion + ", refFamiliares=" + refFamiliares + ", dLegales=" + legalesD + ", curriculum=" + curriculum + ", dSalud=" + dSalud + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this._id);
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + Objects.hashCode(this.apellido);
        hash = 23 * hash + Objects.hashCode(this.nacionalidad);
        hash = 23 * hash + Objects.hashCode(this.genero);
        hash = 23 * hash + Objects.hashCode(this.telefono);
        hash = 23 * hash + Objects.hashCode(this.correo);
        hash = 23 * hash + Objects.hashCode(this.fechaNacimiento);
        hash = 23 * hash + Objects.hashCode(this.direccion);
        hash = 23 * hash + Objects.hashCode(this.refFamiliares);
        hash = 23 * hash + Objects.hashCode(this.legalesD);
        hash = 23 * hash + Objects.hashCode(this.curriculum);
        hash = 23 * hash + Objects.hashCode(this.dSalud);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this._id, other._id)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.nacionalidad, other.nacionalidad)) {
            return false;
        }
        if (!Objects.equals(this.genero, other.genero)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        if (!Objects.equals(this.fechaNacimiento, other.fechaNacimiento)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.refFamiliares, other.refFamiliares)) {
            return false;
        }
        if (!Objects.equals(this.legalesD, other.legalesD)) {
            return false;
        }
        if (!Objects.equals(this.curriculum, other.curriculum)) {
            return false;
        }
        if (!Objects.equals(this.dSalud, other.dSalud)) {
            return false;
        }
        return true;
    }

    
}

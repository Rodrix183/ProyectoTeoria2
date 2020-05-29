/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoteoria2;

import java.util.List;
import java.util.Objects;

public class TipoTrabajo {
    private String nombre;
    private List<String> puestoTrabajo;

    public TipoTrabajo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public void setPuestoTrabajo(List<String> puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nombre);
        hash = 89 * hash + Objects.hashCode(this.puestoTrabajo);
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
        final TipoTrabajo other = (TipoTrabajo) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.puestoTrabajo, other.puestoTrabajo)) {
            return false;
        }
        return true;
    }
    
    
}

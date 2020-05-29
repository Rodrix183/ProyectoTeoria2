/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoteoria2;

import java.util.List;
import java.util.Objects;

public class Empresa {
    private String _id, nombre, cif, ceo;
    private Direccion direccion;
    private List<OfertaEmpleo> ofertas;

    public Empresa() {
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

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public List<OfertaEmpleo> getOfertas() {
        return ofertas;
    }

    public void setOfertas(List<OfertaEmpleo> ofertas) {
        this.ofertas = ofertas;
    }

    @Override
    public String toString() {
        return "Empresa{" + "_id=" + _id + ", nombre=" + nombre + ", cif=" + cif + ", ceo=" + ceo + ", direccion=" + direccion + ", ofertas=" + ofertas + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this._id);
        hash = 61 * hash + Objects.hashCode(this.nombre);
        hash = 61 * hash + Objects.hashCode(this.cif);
        hash = 61 * hash + Objects.hashCode(this.ceo);
        hash = 61 * hash + Objects.hashCode(this.direccion);
        hash = 61 * hash + Objects.hashCode(this.ofertas);
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
        final Empresa other = (Empresa) obj;
        if (!Objects.equals(this._id, other._id)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.cif, other.cif)) {
            return false;
        }
        if (!Objects.equals(this.ceo, other.ceo)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.ofertas, other.ofertas)) {
            return false;
        }
        return true;
    }
    
    
}

/*
Clase Datos Familiares
 */
package proyectoteoria2;

import java.util.Objects;

public class DatoFamiliar {

    private String idPersona, parentesco;

    public DatoFamiliar() {
    }

    public DatoFamiliar(String idPersona, String parentesco) {
        this.idPersona = idPersona;
        this.parentesco = parentesco;
    }

    public String getId() {
        return idPersona;
    }

    public void setId(String id) {
        this.idPersona = id;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public String toString() {
        return "DFamiliar{" + "id=" + idPersona + ", parentesco=" + parentesco + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.idPersona);
        hash = 29 * hash + Objects.hashCode(this.parentesco);
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
        final DatoFamiliar other = (DatoFamiliar) obj;
        if (!Objects.equals(this.idPersona, other.idPersona)) {
            return false;
        }
        if (!Objects.equals(this.parentesco, other.parentesco)) {
            return false;
        }
        return true;
    }

}

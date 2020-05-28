/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoteoria2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DatoAcademico {

    private List<String> estudiosSuperiores;
    private List<String> otrosEstudios;
    private String espacializacion;
    private boolean estudianteActivo;

    public DatoAcademico() {
        estudiosSuperiores = new ArrayList<>();
        otrosEstudios = new ArrayList<>();
    }

    public List<String> getEstudiosSuperiores() {
        return estudiosSuperiores;
    }

    public void setEstudiosSuperiores(List<String> estudiosSuperiores) {
        this.estudiosSuperiores = estudiosSuperiores;
    }

    public List<String> getOtrosEstudios() {
        return otrosEstudios;
    }

    public void setOtrosEstudios(List<String> otrosEstudios) {
        this.otrosEstudios = otrosEstudios;
    }

    public String getEspacializacion() {
        return espacializacion;
    }

    public void setEspacializacion(String espacializacion) {
        this.espacializacion = espacializacion;
    }

    public boolean isEstudianteActivo() {
        return estudianteActivo;
    }

    public void setEstudianteActivo(boolean estudianteActivo) {
        this.estudianteActivo = estudianteActivo;
    }

    @Override
    public String toString() {
        return "DatoAcademico{" + "estudiosSuperiores=" + estudiosSuperiores + ", otrosEstudios=" + otrosEstudios + ", espacializacion=" + espacializacion + ", estudianteActivo=" + estudianteActivo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.estudiosSuperiores);
        hash = 41 * hash + Objects.hashCode(this.otrosEstudios);
        hash = 41 * hash + Objects.hashCode(this.espacializacion);
        hash = 41 * hash + (this.estudianteActivo ? 1 : 0);
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
        final DatoAcademico other = (DatoAcademico) obj;
        if (this.estudianteActivo != other.estudianteActivo) {
            return false;
        }
        if (!Objects.equals(this.espacializacion, other.espacializacion)) {
            return false;
        }
        if (!Objects.equals(this.estudiosSuperiores, other.estudiosSuperiores)) {
            return false;
        }
        if (!Objects.equals(this.otrosEstudios, other.otrosEstudios)) {
            return false;
        }
        return true;
    }
    
    
}

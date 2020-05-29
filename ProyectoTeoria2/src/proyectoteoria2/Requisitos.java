/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoteoria2;

import java.util.Objects;

class Requisitos {
    private DatoAcademico dAcademico;
    private ExpLaboral expLaboral;
    private DatoLegal dLegal;
    private DatoSanitario dSanitario;
    private String sexo;
    private int edadMin;

    public Requisitos() {
    }
    
    

    public DatoAcademico getdAcademico() {
        return dAcademico;
    }

    public void setdAcademico(DatoAcademico dAcademico) {
        this.dAcademico = dAcademico;
    }

    public ExpLaboral getExpLaboral() {
        return expLaboral;
    }

    public void setExpLaboral(ExpLaboral expLaboral) {
        this.expLaboral = expLaboral;
    }

    public DatoLegal getdLegal() {
        return dLegal;
    }

    public void setdLegal(DatoLegal dLegal) {
        this.dLegal = dLegal;
    }

    public DatoSanitario getdSanitario() {
        return dSanitario;
    }

    public void setdSanitario(DatoSanitario dSanitario) {
        this.dSanitario = dSanitario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.dAcademico);
        hash = 59 * hash + Objects.hashCode(this.expLaboral);
        hash = 59 * hash + Objects.hashCode(this.dLegal);
        hash = 59 * hash + Objects.hashCode(this.dSanitario);
        hash = 59 * hash + Objects.hashCode(this.sexo);
        hash = 59 * hash + this.edadMin;
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
        final Requisitos other = (Requisitos) obj;
        if (this.edadMin != other.edadMin) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        if (!Objects.equals(this.dAcademico, other.dAcademico)) {
            return false;
        }
        if (!Objects.equals(this.expLaboral, other.expLaboral)) {
            return false;
        }
        if (!Objects.equals(this.dLegal, other.dLegal)) {
            return false;
        }
        if (!Objects.equals(this.dSanitario, other.dSanitario)) {
            return false;
        }
        return true;
    }
    
    
}

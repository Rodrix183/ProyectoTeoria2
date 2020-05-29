/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoteoria2;

import java.util.List;
import java.util.Objects;

class OfertaEmpleo {
   private String codigo, areaEmpresa, cargo, tipoContrato, gradoAcademico;
   private List<String> Puestos;
   private int vacantes, sueldo, anioExp;
   private Requisitos requisitos;
   private List<String> seleccionados;
   private List<String> aplicantes;

    public OfertaEmpleo() {
    }
   

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAreaEmpresa() {
        return areaEmpresa;
    }

    public void setAreaEmpresa(String areaEmpresa) {
        this.areaEmpresa = areaEmpresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    public List<String> getPuestos() {
        return Puestos;
    }

    public void setPuestos(List<String> Puestos) {
        this.Puestos = Puestos;
    }

    public int getVacantes() {
        return vacantes;
    }

    public void setVacantes(int vacantes) {
        this.vacantes = vacantes;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getAnioExp() {
        return anioExp;
    }

    public void setAnioExp(int anioExp) {
        this.anioExp = anioExp;
    }

    public Requisitos getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(Requisitos requisitos) {
        this.requisitos = requisitos;
    }

    public List<String> getSeleccionados() {
        return seleccionados;
    }

    public void setSeleccionados(List<String> seleccionados) {
        this.seleccionados = seleccionados;
    }

    public List<String> getAplicantes() {
        return aplicantes;
    }

    public void setAplicantes(List<String> aplicantes) {
        this.aplicantes = aplicantes;
    }

    @Override
    public String toString() {
        return "OfertaEmpleo{" + "codigo=" + codigo + ", areaEmpresa=" + areaEmpresa + ", cargo=" + cargo + ", tipoContrato=" + tipoContrato + ", gradoAcademico=" + gradoAcademico + ", Puestos=" + Puestos + ", vacantes=" + vacantes + ", sueldo=" + sueldo + ", anioExp=" + anioExp + ", requisitos=" + requisitos + ", seleccionados=" + seleccionados + ", aplicantes=" + aplicantes + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.codigo);
        hash = 29 * hash + Objects.hashCode(this.areaEmpresa);
        hash = 29 * hash + Objects.hashCode(this.cargo);
        hash = 29 * hash + Objects.hashCode(this.tipoContrato);
        hash = 29 * hash + Objects.hashCode(this.gradoAcademico);
        hash = 29 * hash + Objects.hashCode(this.Puestos);
        hash = 29 * hash + this.vacantes;
        hash = 29 * hash + this.sueldo;
        hash = 29 * hash + this.anioExp;
        hash = 29 * hash + Objects.hashCode(this.requisitos);
        hash = 29 * hash + Objects.hashCode(this.seleccionados);
        hash = 29 * hash + Objects.hashCode(this.aplicantes);
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
        final OfertaEmpleo other = (OfertaEmpleo) obj;
        if (this.vacantes != other.vacantes) {
            return false;
        }
        if (this.sueldo != other.sueldo) {
            return false;
        }
        if (this.anioExp != other.anioExp) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.areaEmpresa, other.areaEmpresa)) {
            return false;
        }
        if (!Objects.equals(this.cargo, other.cargo)) {
            return false;
        }
        if (!Objects.equals(this.tipoContrato, other.tipoContrato)) {
            return false;
        }
        if (!Objects.equals(this.gradoAcademico, other.gradoAcademico)) {
            return false;
        }
        if (!Objects.equals(this.Puestos, other.Puestos)) {
            return false;
        }
        if (!Objects.equals(this.requisitos, other.requisitos)) {
            return false;
        }
        if (!Objects.equals(this.seleccionados, other.seleccionados)) {
            return false;
        }
        if (!Objects.equals(this.aplicantes, other.aplicantes)) {
            return false;
        }
        return true;
    }

}

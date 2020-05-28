/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoteoria2;

import java.util.List;
import java.util.Objects;


/**
 *
 * @author Faith
 */
public class Curriculum {
    private List<String> expectativaLaboral;
    private int salarioEsperado;
    private String tipoContrato;
    private Habilidades habilidaes;
    private ExpLaboral expLaboral;
    private DatoAcademico datAcademicos;

    public Curriculum() {
    }

    public List getExpectativaLaboral() {
        return expectativaLaboral;
    }

    public void setExpectativaLaboral(List expectativaLaboral) {
        this.expectativaLaboral = expectativaLaboral;
    }

    public int getSalarioEsperado() {
        return salarioEsperado;
    }

    public void setSalarioEsperado(int salarioEsperado) {
        this.salarioEsperado = salarioEsperado;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public Habilidades getHabilidaes() {
        return habilidaes;
    }

    public void setHabilidaes(Habilidades habilidaes) {
        this.habilidaes = habilidaes;
    }

    public ExpLaboral getExpLaboral() {
        return expLaboral;
    }

    public void setExpLaboral(ExpLaboral expLaboral) {
        this.expLaboral = expLaboral;
    }

    public DatoAcademico getDatAcademicos() {
        return datAcademicos;
    }

    public void setDatAcademicos(DatoAcademico datAcademicos) {
        this.datAcademicos = datAcademicos;
    }

    @Override
    public String toString() {
        return "Curriculum{" + "expectativaLaboral=" + expectativaLaboral + ", salarioEsperado=" + salarioEsperado + ", tipoContrato=" + tipoContrato + ", habilidaes=" + habilidaes + ", expLaboral=" + expLaboral + ", datAcademicos=" + datAcademicos + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.expectativaLaboral);
        hash = 59 * hash + this.salarioEsperado;
        hash = 59 * hash + Objects.hashCode(this.tipoContrato);
        hash = 59 * hash + Objects.hashCode(this.habilidaes);
        hash = 59 * hash + Objects.hashCode(this.expLaboral);
        hash = 59 * hash + Objects.hashCode(this.datAcademicos);
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
        final Curriculum other = (Curriculum) obj;
        if (this.salarioEsperado != other.salarioEsperado) {
            return false;
        }
        if (!Objects.equals(this.tipoContrato, other.tipoContrato)) {
            return false;
        }
        if (!Objects.equals(this.expectativaLaboral, other.expectativaLaboral)) {
            return false;
        }
        if (!Objects.equals(this.habilidaes, other.habilidaes)) {
            return false;
        }
        if (!Objects.equals(this.expLaboral, other.expLaboral)) {
            return false;
        }
        if (!Objects.equals(this.datAcademicos, other.datAcademicos)) {
            return false;
        }
        return true;
    }
}

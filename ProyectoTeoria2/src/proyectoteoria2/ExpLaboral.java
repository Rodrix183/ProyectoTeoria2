/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoteoria2;

import java.util.Objects;

public class ExpLaboral {
    private int aniosExp;
    private String trabajoAnterior, PuestoAnterior;

    public ExpLaboral() {
    }

    public int getAniosExp() {
        return aniosExp;
    }

    public void setAniosExp(int aniosExp) {
        this.aniosExp = aniosExp;
    }

    public String getTrabajoAnterior() {
        return trabajoAnterior;
    }

    public void setTrabajoAnterior(String trabajoAnterior) {
        this.trabajoAnterior = trabajoAnterior;
    }

    public String getPuestoAnterior() {
        return PuestoAnterior;
    }

    public void setPuestoAnterior(String PuestoAnterior) {
        this.PuestoAnterior = PuestoAnterior;
    }

    @Override
    public String toString() {
        return "ExpLaboral{" + "aniosExp=" + aniosExp + ", trabajoAnterior=" + trabajoAnterior + ", PuestoAnterior=" + PuestoAnterior + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.aniosExp;
        hash = 41 * hash + Objects.hashCode(this.trabajoAnterior);
        hash = 41 * hash + Objects.hashCode(this.PuestoAnterior);
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
        final ExpLaboral other = (ExpLaboral) obj;
        if (this.aniosExp != other.aniosExp) {
            return false;
        }
        if (!Objects.equals(this.trabajoAnterior, other.trabajoAnterior)) {
            return false;
        }
        if (!Objects.equals(this.PuestoAnterior, other.PuestoAnterior)) {
            return false;
        }
        return true;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoteoria2;

public class DatoSanitario {

    private boolean alergia, problemaRespiratorio, problemaCardiaco, problemaMental;

    public DatoSanitario() {
    }

    public boolean isAlergia() {
        return alergia;
    }

    public void setAlergia(boolean alergia) {
        this.alergia = alergia;
    }

    public boolean isProblemaRespiratorio() {
        return problemaRespiratorio;
    }

    public void setProblemaRespiratorio(boolean problemaRespiratorio) {
        this.problemaRespiratorio = problemaRespiratorio;
    }

    public boolean isProblemaCardiaco() {
        return problemaCardiaco;
    }

    public void setProblemaCardiaco(boolean problemaardiaco) {
        this.problemaCardiaco = problemaardiaco;
    }

    public boolean isProblemaMental() {
        return problemaMental;
    }

    public void setProblemaMental(boolean problemaMental) {
        this.problemaMental = problemaMental;
    }

    @Override
    public String toString() {
        return "DatoSanitario{" + "alergia=" + alergia + ", problemaRespiratorio=" + problemaRespiratorio + ", problemaardiaco=" + problemaCardiaco + ", problemaMental=" + problemaMental + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.alergia ? 1 : 0);
        hash = 17 * hash + (this.problemaRespiratorio ? 1 : 0);
        hash = 17 * hash + (this.problemaCardiaco ? 1 : 0);
        hash = 17 * hash + (this.problemaMental ? 1 : 0);
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
        final DatoSanitario other = (DatoSanitario) obj;
        if (this.alergia != other.alergia) {
            return false;
        }
        if (this.problemaRespiratorio != other.problemaRespiratorio) {
            return false;
        }
        if (this.problemaCardiaco != other.problemaCardiaco) {
            return false;
        }
        if (this.problemaMental != other.problemaMental) {
            return false;
        }
        return true;
    }

}

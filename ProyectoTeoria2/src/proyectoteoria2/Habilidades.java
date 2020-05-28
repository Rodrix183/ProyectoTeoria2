/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoteoria2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Habilidades {

    private List<String> idiomas;
    private List<String> tecnicas;

    public Habilidades() {
        
    }

    public List<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(List<String> idiomas) {
        this.idiomas = idiomas;
    }

    public List<String> getTecnicas() {
        return tecnicas;
    }

    public void setTecnicas(List<String> tecnicas) {
        this.tecnicas = tecnicas;
    }

    @Override
    public String toString() {
        return "Habilidades{" + "idiomas=" + idiomas + ", tecnicas=" + tecnicas + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.idiomas);
        hash = 73 * hash + Objects.hashCode(this.tecnicas);
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
        final Habilidades other = (Habilidades) obj;
        if (!Objects.equals(this.idiomas, other.idiomas)) {
            return false;
        }
        if (!Objects.equals(this.tecnicas, other.tecnicas)) {
            return false;
        }
        return true;
    }

    
    
    

    
    
    
    
}

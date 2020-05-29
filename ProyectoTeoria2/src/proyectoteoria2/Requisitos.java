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
    private String sexo;
    private int edadMin;
    private DatosSanitarios datosSanitarios;

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

    public DatosSanitarios getDatosSanitarios() {
        return datosSanitarios;
    }

    public void setDatosSanitarios(DatosSanitarios datosSanitarios) {
        this.datosSanitarios = datosSanitarios;
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
    
}

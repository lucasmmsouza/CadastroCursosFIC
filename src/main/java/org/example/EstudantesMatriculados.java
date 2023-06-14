package org.example;


import java.util.*;

class EstudantesMatriculados {
    private Date dataMatricula;
    private List<Estudante> matriculados;

    public EstudantesMatriculados(Date dataMatricula) {
        this.matriculados = new ArrayList<>();
        this.dataMatricula = dataMatricula;
    }

    public List<Estudante> getMatriculados() {
        return matriculados;
    }

    public Object getDataMatricula() {
    }
}

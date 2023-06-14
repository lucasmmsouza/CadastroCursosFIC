package org.example;

import java.util.*;


class TurmaCurso {
    private String local;
    private int vagas;
    private int vagasDisponiveis;
    private Date inicioAulas;
    private Date fimAulas;
    private Date inicioMatriculas;
    private Date fimMatriculas;
    private List<EstudantesMatriculados> estudantesMatriculados;

    public TurmaCurso(String local, int vagas, Date inicioAulas, Date fimAulas, Date inicioMatriculas, Date fimMatriculas) {
        this.local = local;
        this.vagas = vagas;
        this.vagasDisponiveis = vagas;
        this.inicioAulas = inicioAulas;
        this.fimAulas = fimAulas;
        this.inicioMatriculas = inicioMatriculas;
        this.fimMatriculas = fimMatriculas;
        this.estudantesMatriculados = new ArrayList<>();
    }

    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }

    public void setVagasDisponiveis(int vagasDisponiveis) {
        this.vagasDisponiveis = vagasDisponiveis;
    }

    public List<Date> getPeriodoMatriculas() {
        List<Date> periodoMatriculas = new ArrayList<>();
        periodoMatriculas.add(inicioMatriculas);
        periodoMatriculas.add(fimMatriculas);
        return periodoMatriculas;
    }

    public void matricularEstudante(Estudante estudante, Date dataMatricula) {
        if (podeMatricular(dataMatricula) && vagasDisponiveis > 0) {
            EstudantesMatriculados em = null;
            for (EstudantesMatriculados matriculados : estudantesMatriculados) {
                if (matriculados.getDataMatricula().equals(dataMatricula)) {
                    em = matriculados;
                    break;
                }
            }

            if (em == null) {
                em = new EstudantesMatriculados(dataMatricula);
                estudantesMatriculados.add(em);
            }

            em.getMatriculados().add(estudante);
            vagasDisponiveis--;
        }
    }

    private boolean podeMatricular(Date dataMatricula) {
    }
}

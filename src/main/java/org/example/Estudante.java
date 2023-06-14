package org.example;
import java.util.*;

class Estudante {
    private String nome;
    private String matricula;
    private Date dataNascimento;
    private String endereco;
    private String emailInstitucional;
    private Celular celular;

    public Estudante(String nome, String matricula, Date dataNascimento, String endereco, String emailInstitucional, Celular celular) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.emailInstitucional = emailInstitucional;
        this.celular = celular;
    }

    public String gerarMatricula() {
    }
}

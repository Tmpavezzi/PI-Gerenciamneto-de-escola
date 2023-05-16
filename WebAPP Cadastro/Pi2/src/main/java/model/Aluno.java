package model;

public class Aluno {
    private String idAluno;
    private String nome;
    private String sexo;
    private String dataNascimento;
    private String estadoCivil;
    private String cpf;
    private String rg;
    private String orgaoEmissor;
    private String celular;
    private String email;
    private String endereco;
    private String serie;
    private String sala;
    private String turma;
    private String observacao;

    public Aluno(String idAluno, String nome, String sexo, String dataNascimento, String estadoCivil, String cpf, String rg, String orgaoEmissor, String celular, String email, String endereco, String serie, String sala, String turma, String observacao) {
        this.idAluno = idAluno;
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.estadoCivil = estadoCivil;
        this.cpf = cpf;
        this.rg = rg;
        this.orgaoEmissor = orgaoEmissor;
        this.celular = celular;
        this.email = email;
        this.endereco = endereco;
        this.serie = serie;
        this.sala = sala;
        this.turma = turma;
        this.observacao = observacao;
    }

    public Aluno(String nome, String sexo, String dataNascimento, String estadoCivil, String cpf, String rg, String orgaoEmissor, String celular, String email, String endereco, String serie, String sala, String turma, String observacao) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.estadoCivil = estadoCivil;
        this.cpf = cpf;
        this.rg = rg;
        this.orgaoEmissor = orgaoEmissor;
        this.celular = celular;
        this.email = email;
        this.endereco = endereco;
        this.serie = serie;
        this.sala = sala;
        this.turma = turma;
        this.observacao = observacao;
    }

    public String getIdAluno() {
        return idAluno;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public String getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getSerie() {
        return serie;
    }

    public String getSala() {
        return sala;
    }

    public String getTurma() {
        return turma;
    }

    public String getObservacao() {
        return observacao;
    }
}

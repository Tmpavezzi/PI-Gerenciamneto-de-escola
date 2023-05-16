package model;


public class Funcionario {
    private String idFuncionario;
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
    private String cargo;
    private String graduacao;
    private String conhecimento;
    private String observacao;

    public Funcionario(String nome, String sexo, String dataNascimento, String estadoCivil, String cpf, String rg, String orgaoEmissor, String celular, String email, String endereco, String cargo, String graduacao, String conhecimento, String observacao) {
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
        this.cargo = cargo;
        this.graduacao = graduacao;
        this.conhecimento = conhecimento;
        this.observacao = observacao;
    }

    public Funcionario(String idFuncionario, String nome, String sexo, String dataNascimento, String estadoCivil, String cpf, String rg, String orgaoEmissor, String celular, String email, String endereco, String cargo, String graduacao, String conhecimento, String observacao) {
        this.idFuncionario = idFuncionario;
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
        this.cargo = cargo;
        this.graduacao = graduacao;
        this.conhecimento = conhecimento;
        this.observacao = observacao;

    }

    public String getIdFuncionario() {
        return idFuncionario;
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

    public String getCargo() {
        return cargo;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public String getConhecimento() {
        return conhecimento;
    }

    public String getObservacao() {
        return observacao;
    }
}

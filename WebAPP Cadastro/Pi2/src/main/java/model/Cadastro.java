package model;

public class Cadastro {
    private String idCadastro;
    private String nome;
    private String email;
    private String senha;

    public Cadastro(String idCadastro, String nome, String email, String senha) {
        this.idCadastro = idCadastro;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Cadastro(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getIdCadastro() {
        return idCadastro;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
}

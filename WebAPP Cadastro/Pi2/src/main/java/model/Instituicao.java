package model;

public class Instituicao {

    private String id;
    private String nome;
    private String curso;
    private String localizacao;

    public Instituicao(String id, String nome, String curso, String localizacao) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
        this.localizacao = localizacao;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public String getLocalizacao() {
        return localizacao;
    }
}

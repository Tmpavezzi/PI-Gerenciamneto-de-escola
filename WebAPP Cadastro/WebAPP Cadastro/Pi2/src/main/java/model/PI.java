package model;

public class PI {


    private String name ;

    private String email;

    private String senha;

    private String  id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public PI(String name, String email, String senha, String id) {
        this.name = name;
        this.email = email;
        this.senha = senha;
        this.id = id;
    }

    public PI(String name, String email, String senha) {
        this.name = name;
        this.email = email;
        this.senha = senha;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }



}

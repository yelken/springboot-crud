package main.java.com.example.crud.model;

public class Pato implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;

    public Pato() {}

    public Pato(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
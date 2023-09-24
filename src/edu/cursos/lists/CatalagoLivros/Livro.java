package edu.cursos.lists.CatalagoLivros;

public class Livro {
    private String título;
    private String autor;
    private int ano;
    
    public Livro(String título, String autor, int ano) {
        this.título = título;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTítulo() {
        return título;
    }
    public void setTítulo(String título) {
        this.título = título;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }


}

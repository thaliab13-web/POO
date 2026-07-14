package ads.poo.Excercoes;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private ArrayList<Livro> livrosEmprestado;



    public Usuario(String nome) {
        this.nome = nome;
        this.livrosEmprestado = new ArrayList<>();

    }

    public ArrayList<Livro> getLivrosEmprestado() {
        return livrosEmprestado;
    }

}

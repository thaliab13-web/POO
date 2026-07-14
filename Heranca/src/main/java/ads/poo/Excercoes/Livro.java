package ads.poo.Excercoes;

public class Livro {
    private final String titulo;
    private boolean emprestado;

    public Livro(String titulo, boolean emprestado) {
        this.titulo = titulo;
        this.emprestado = false;
    }
    public String getTitulo() {
        return titulo;
    }
    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}

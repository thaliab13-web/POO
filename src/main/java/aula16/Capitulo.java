package aula16;


public class Capitulo {
    private final String titulo;

    // construtor inicializando o atributo
    public Capitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return titulo + "\n";
    }
}

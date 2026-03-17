package exemplosCasa;

public class Aluno {

    // Atributos
    private String nome;
    private int matricula;
    private double nota1;
    private double nota2;


    /* Método set atribui valor na variavel  */
    /* void não retorna valor */
    public void setNome(String n) {
        this.nome = n;
    }
    /*Get retorna o valor seguro */
    public String getNome() {
        return nome;
    }
    public void setMatricula(int m) {
        this.matricula = m;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setNota1(double n1) {
        this.nota1 = n1;
    }
    public double getNota1() {
        return nota1;
    }
    public void setNota2(double n2) {
        this.nota2 = n2;
    }
    public double getNota2() {
        return nota2;
    }

    /* Método de Ação retonando valor, por isso não tem void */
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    /* Método de Ação */
    public String verificarSituacao() {

        if(calcularMedia() >= 7) {
            return "Aprovado";
        } else {
            return"Reprovado";
        }
    }



    public void mostraDados() {
        IO.println("====== Tal Aluno: ======");
        IO.println("Nome do suposto: " + nome);
        IO.println("Número de Matricula: " + matricula);
        IO.println("Nota 1: " + nota1);
        IO.println("Nota 2: " + nota2);
        IO.println("Média Final: " + calcularMedia());
        IO.println("Situação: " + verificarSituacao());


        IO.println("=========================================");



    }

}

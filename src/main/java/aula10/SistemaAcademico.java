package aula10;

public class SistemaAcademico {

    // Atributos definem o estado de um objeto
    private String nomeDisciplina;
    private int cargaHoraria;
    private String periodoTurno;
    private int codigo;
    private String professor;


    // Métodos define comportamentos ou ações que o objeto pode fazer
    // SET atribuindo valor a variavel
    public void setNomeDisciplina(String n) {
        this.nomeDisciplina = n;
    }
    public void setCargaHoraria(int h){
        this.cargaHoraria = h;
    }
    public void setPeriodoTurno(String p){
        this.periodoTurno = p;
    }
    public void setCodigo(int c){
        this.codigo = c;
    }
    public void setProfessor(String pf) {
        this.professor = pf;
    }

    //GET retonando valores das variaveis
    public String getNomeDisciplina(){
        return nomeDisciplina;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public String getPeriodoTurno() {
        return periodoTurno;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getProfessor() {
        return professor;
    }

    // método pra dar os prints
    public void exibirDados() {
        IO.println("---- Matéria disponivel ----");
        IO.println("Disciplina: " + this.nomeDisciplina);
        IO.println("Carga horária: " + this.cargaHoraria + " horas");
        IO.println("Periodo: " + this.periodoTurno);
        IO.println("Código: " + this.codigo);
        IO.println("Docente responsável: " + this.professor);

    }


}

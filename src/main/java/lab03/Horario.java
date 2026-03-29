package lab03;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;


    // Construtor Padrão, inicializado com zero
    public Horario() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }
    // construtor para hora
    public Horario(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
            this.minuto = 0;
            this.segundo = 0;
        } else {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
    }

    public Horario(int hora, int minuto) {
        if (hora >= 0 && hora <= 23 && minuto >= 0 && minuto <= 59) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = 0;
        } else {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
    }

    public Horario(int hora, int minuto, int segundo) {
        if (hora >= 0 && hora <= 23 && minuto >= 0 && minuto <= 59 && segundo >= 0 && segundo <= 59) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
    }
    public boolean setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora; // Muda a hora
            return true;
        }
        return false; // Não muda a hora
    }
    public boolean setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto; // alterando o valor
            return true;
        }
        return false;
    }

    public boolean setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
            return true;
        }
        return false;
    }
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
    public String numeroPorExtenso(int n) {
        switch (n) {
            case 0: return "zero";
            case 1: return "um";
            case 2: return "dois";
            case 3: return "três";
            case 4: return "quatro";
            case 5: return "cinco";
            case 6: return "seis";
            case 7: return "sete";
            case 8: return "oito";
            case 9: return "nove";
            case 10: return "dez";
            case 11: return "onze";
            case 12: return "doze";
            case 13: return "treze";
            case 14: return "quatorze";
            case 15: return "quinze";
            case 16: return "dezesseis";
            case 17: return "dezessete";
            case 18: return "dezoito";
            case 19: return "dezenove";
            case 20: return "vinte";
            default: return String.valueOf(n); // transforma número em texto
        }
    }

    public String porExtenso() {
        return numeroPorExtenso(hora) + " horas, " +
                numeroPorExtenso(minuto) + " minutos e " +
                numeroPorExtenso(segundo) + " segundos";
    }

    // Converter para segundos
    public long emSegundos() {
        return hora * 3600 + minuto * 60 + segundo;
    }

    // Diferença entre horarios
    public long diferenca(Horario outro) {
        return Math.abs(this.emSegundos() - outro.emSegundos());
        // Math.abs garante que o valor não seja negativo
    }
}

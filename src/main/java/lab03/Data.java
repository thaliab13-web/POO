package lab03;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
    }

  // metodo validador da data
    public boolean dataValida(int dia, int mes, int ano) {

        // validando o mes
        if (mes < 1 || mes > 12) return false;

        int limiteDia; // guarda os dias que der ok

        switch (mes) {
            case 2:
                if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) { // bissexto
                    limiteDia = 29;
                } else {
                    limiteDia = 28;
                }
                break;
            case 4, 6, 9, 11:
                limiteDia = 30;
                break;
            default:
                limiteDia = 31;
                break;
        }
        // validando os dias
        if (dia < 1 || dia > limiteDia) return false;

        return true;
    }

    // metodo sobrecarregador (dia, mes, ano) com a função de validar data
    public Data(int dia, int mes, int ano) {
        if(dataValida(dia,mes,ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            IO.println("Data inválida, será add o valor padrão do sistema");
            this.dia = 1;
            this.mes = 1;
            this.ano = 1970;
        }
    }
    // método sobregarregado dia com o validador
    public Data(int dia) {
        this(dia,1,1970);
    }

    // Método sobregarregado mes, com o validador
    public Data(int dia, int mes) {
        this(dia,mes,1970);
    }

    // método alterador modificador dos dados set
    public boolean setDia(int dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia; // atualiza o dia
            return true;
        } else {
            return false;
        }
    }
    public boolean setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes; // atualiza o mes
            return true;
        } else { // valor não válido
            return false; // mantém o valor do atributo
        }
    }

    public boolean setAno(int ano) {
        if (ano >= 1) {
            this.ano = ano; // atualiza o ano
            return true;
        } else {
            return false;
        }
    }

    // Métodos de retorno
    public int getDia(){
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAno() {
        return ano;
    }

    // metodo retorna texto do objeto
    @Override
    public String toString() {
       return String.format("%02d/%02d/%d", dia,mes,ano);
    }

    // Método que retorna mes por extenso
    public String nomePorExtenso(int mes) {
        switch (mes) {
            case 1: return "janeiro";
            case 2: return "fevereiro";
            case 3: return "março";
            case 4: return "abril";
            case 5: return "maio";
            case 6: return "junho";
            case 7: return "julho";
            case 8: return "agosto";
            case 9: return "setembro";
            case 10: return "outubro";
            case 11: return "novembro";
            case 12: return "dezembro";
            // Transforma o número em texto
            default: return "mês inválido";
        }
    }
    // Método retornando o valor passado para extenso
    public String porExtenso() {
        return (dia + " de " + nomePorExtenso(mes) + " de " + ano);
    }

    // Método para converte ano mes em um total de dias
    public long diasTotais() {
        long totalDias = 0;
        // somar ano
        for (int i = 1; i < this.ano; i++) {
            // ano bissexto
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                totalDias += 366;
            } else {
                totalDias += 365;
            }
        }
        // vetor para o mes, pegar os dias dos meses
        int[] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31};

        // verificando se o ano é bissexto
        if ((this.ano % 4 == 0 && this.ano % 100 != 0 || this.ano % 400 == 0)) {
            diasMes[1] = 29; // fevereiro
        }
        // vai rodando no mes que se encontra o objeto e soma a qtd de dias desse mes
        for(int i = 0; i < this.mes - 1; i++) {
            totalDias += diasMes[i];
        }
        // total dos dias
        totalDias += this.dia;

        return totalDias;
    }
    // metodo diferença de dias
    public long diferencaDeDias(Data outraData) {

        long dias1 = this.diasTotais(); // pega a data atual do objeto
        long dias2 = outraData.diasTotais(); // Outra data para transformar em Total de dias
        // Math.ads retorna um valor absoluto positivo
        return Math.abs(dias1 - dias2); // diferença entre os valores
    }

}

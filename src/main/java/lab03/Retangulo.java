package lab03;

public class Retangulo {

    private int largura;
    private int altura;
    private String codi;

    // Construtor padrão
    public Retangulo() {
        this.largura = 4;
        this.altura = 3;
        this.codi = "ASCII";
    }

    // Contrutor sobrecarga
    public Retangulo(int largura, int altura, String codi) {

        this.largura = (largura > 0) ? largura : 4;

        this.altura = (altura > 0) ? altura : 3;

        if ("ASCII".equals(codi) || "UTF8".equals(codi)) {
            this.codi = codi;
        } else {
            this.codi = "ASCII";
        }
    }

    // metodo set altera valor (modificadores)
    public boolean setLargura(int largura) {

        if (largura > 0) {
            this.largura = largura;
            return true;
        } else {
            return false;
        }
    }

    // metodo set altera valor (modificadores)
    public boolean setAltura(int altura) {
        if (altura > 0) {
            this.altura = altura;
            return true;
        } else {
            return false;
        }
    }

    public boolean setCodi(String codi) {

        if ("ASCII".equals(codi) || "UTF8".equals(codi)) {
            this.codi = codi;
            return true;
        } else {
            return false;
        }
    }

    // metodo get (acessores) retorna valor
    public int getLargura() {
        return largura;
    }

    // metodo get (acessores) retorna valor
    public int getAltura() {
        return altura;
    }

    // metodo get (acessores) retorna valor
    public String getCodi() {
        return codi;
    }

    // metodo calcula area
    public int area() {
        return (largura * altura);

    }
        // metodo calula perimetro',

    public int perimetro() {
        return (2 * (largura + altura));
    }

    @Override // --> reescrevendo o método toString()
    // toString transforma o obejto em texto
    public String toString() {
        // StringBuilder classe para montar texto (tipo da caixa)
        // sb nome da caixa (nome da variavel
        // final não deixa trocar o objeto depois
        final StringBuilder sb = new StringBuilder(); // cria o construtor de texto

        // Parte de cima
        String topo = "+" + "-".repeat(largura) + "+\n";
        sb.append(topo); // adiciona essa linha dentro do StringBuider

        // meio
        String miolo = "|" + " ".repeat(largura) + "|\n"; // cria uma linha vazia
        sb.append(miolo.repeat(altura)); // append serve para cancatenação de strings

        // Parte de Baixo
        String baixo = "+" + "-".repeat(largura) + "+\n";
        sb.append(baixo);

        //  Transforma tudo oq foi montado em String final
        return sb.toString();

    }
}

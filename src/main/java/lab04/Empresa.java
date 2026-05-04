package lab04;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Motorista> motoristas;
    private ArrayList<Veiculo> veiculos;
    private ArrayList<Registro> registros;

    public Empresa() {
        this.motoristas = new ArrayList<>();
        this.veiculos = new ArrayList<>();
        this.registros = new ArrayList<>();
    }

    public void addMotorista(Motorista m) {
        motoristas.add(m);
    }
    public void addVeiculo(Veiculo v) {
        veiculos.add(v);
    }
    public void addRegistro(Registro r) {
        registros.add(r);
    }
    public void removerMotorista(Motorista m) {
        motoristas.remove(m);
    }
    public void removerVeiculo(Veiculo v) {
        veiculos.remove(v);
    }
    public void removerRegistro(Registro r) {
        registros.remove(r);
    }
    public void atualizarMotorista(String cpf, String novoNome) {
        for (Motorista m : motoristas) {
            if(m.getCpf().equals(cpf)) {
                m.setNome(novoNome);
            }
        }
    }
    public void atualizarVeiculo(String placa, String novoModelo) {
        for (Veiculo v : veiculos) {
            if (v.getPlaca().equals(placa)) {
                v.setModelo(novoModelo);
            }
        }
    }
    @Override
    public String toString() {
     return String.format(
             """
                     Motorista: 
                     %s
                     Veiculo: 
                     %s
                     Registro:
                     %s
                     """,
             motoristas,
             veiculos,
             registros
     );
    }
}

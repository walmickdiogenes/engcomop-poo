package jesus.salva;

import java.util.ArrayList;

public class Movimento {
    private int sequencial;
    private int dia;
    private int numHoras;
    private Veiculo veiculo;

    public Movimento(int sequencial, int dia, int numHoras, Veiculo veiculo) {
        this.sequencial = sequencial;
        this.dia = dia;
        this.numHoras = numHoras;
        this.veiculo = veiculo;
    }

    public int getSequencial() {
        return sequencial;
    }

    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}

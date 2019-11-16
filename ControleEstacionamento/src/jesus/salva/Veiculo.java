package jesus.salva;

public class Veiculo {
    private int sequencial;
    private String placa;
    private float valorHora;

    public Veiculo(int sequencial, String placa, float valorHora) {
        this.sequencial = sequencial;
        this.placa = placa;
        this.valorHora = valorHora;
    }

    public int getSequencial() {
        return sequencial;
    }

    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
}

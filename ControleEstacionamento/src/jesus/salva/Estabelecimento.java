package jesus.salva;

import java.util.ArrayList;

public class Estabelecimento {
    private int ano;
    private int mes;
    private Movimento movimento;
    private Veiculo veiculo;
    private ArrayList<Movimento> movimentos = new ArrayList();

    public Estabelecimento(int ano, int mes) {
        this.ano = ano;
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public Movimento getMovimento() {
        return movimento;
    }

    public void setMovimento(Movimento movimento) {
        this.movimento = movimento;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public ArrayList<Movimento> getMovimentos() {
        return movimentos;
    }

    public void setMovimentos(ArrayList<Movimento> movimentos) {
        this.movimentos = movimentos;
    }

    public void calcularTotais(){
        int suv = 0;
        int cmedio = 0; //carro medio
        int cpequeno = 0; //carro pequeno
        int motos = 0;
        float totals = 0; //total suv
        float totalcm = 0; //total carro medio
        float totalcp = 0; //total carro pequeno
        float totalm = 0; //total motos
        for(int i=0; i < movimentos.size(); i++){
            if(getVeiculo().getValorHora() == 3){
                totalm += getVeiculo().getValorHora() * getMovimento().getNumHoras();
                motos++;
            } else if(getVeiculo().getValorHora() == 5){
                totalcp += getVeiculo().getValorHora() * getMovimento().getNumHoras();
                cpequeno++;
            } else if(getVeiculo().getValorHora() == 8){
                totalcm += getVeiculo().getValorHora() * getMovimento().getNumHoras();
                cmedio++;
            } else if(getVeiculo().getValorHora() == 10){
                totals += getVeiculo().getValorHora() * getMovimento().getNumHoras();
                suv++;
            }
        }
        float totalFaturamento = totalcm + totalcp + totalm + totals;
        System.out.println("Total SUV: Quantidade " + suv + " Valor: " + totals);
        System.out.println("Total Carro Médio: Quantidade " + cmedio + " Valor: " + totalcm);
        System.out.println("Total Carro Pequeno: Quantidade " + cpequeno + " Valor: " + totalcp);
        System.out.println("Total Motos: Quantidade " + motos + " Valor: " + totalm);
        System.out.println("Total Faturamento: " + totalFaturamento);
    }

    public void inserirCarro(Movimento movi) {
        movimentos.add(movi);
    }

}


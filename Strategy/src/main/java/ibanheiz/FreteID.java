package ibanheiz;

public interface FreteID {
    public default double calcular(String cepOrigem, String cepDestino, NotaFiscal notaFiscal){
        double retorno = 0;
        if(this instanceof FreteLotacao){
            retorno = 250.0;
        } else if(this instanceof FreteFracionado){
            retorno = 100.0;
        }
        return retorno;
    }

}
